package com.fwtd.designpattern;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @classname: ChainOfResponsibility
 * @description: 责任链模式 request -> filter1 -> filter2 -> response2 -> response1 -> response
 * @date: 2021/12/07/8:36 下午
 * @author: wangtingdong
 * @email: it_wangtingdong@163.com
 */
public class ChainOfResponsibility {
    public static void main(String[] args) {
        final FilterChain filterChain = new FilterChain();
        filterChain.add(new FilterCharacter()).add(new FilterSensitive());
        final Request request = new Request("start");
        final Response response = new Response("end");
        filterChain.doFilter(request, response, filterChain);
        System.out.println(request.getMsg());
        System.out.println(response.getMsg());
    }
}

@Getter
class Request {
    String msg;

    public Request(String msg) {
        this.msg = msg;
    }
}

@Getter
class Response {
    String msg;

    public Response(String msg) {
        this.msg = msg;
    }
}

interface ServletFilter {
    boolean doFilter(Request request, Response response, FilterChain chain);
}

class FilterCharacter implements ServletFilter {
    @Override
    public boolean doFilter(Request request, Response response, FilterChain chain) {
        request.msg += "-character-request";
        chain.doFilter(request, response, chain);
        response.msg += "-character-response";
        return true;
    }
}

class FilterSensitive implements ServletFilter {
    @Override
    public boolean doFilter(Request request, Response response, FilterChain chain) {
        request.msg += "-sensitive-request";
        chain.doFilter(request, response, chain);
        response.msg += "-sensitive-response";
        return true;
    }
}

class FilterChain implements ServletFilter {
    private final List<ServletFilter> filters = new ArrayList<>();

    int index = 0;// 使用变量标记执行的哪个filter

    // 链式编程
    public FilterChain add(ServletFilter filter) {
        filters.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(Request request, Response response, FilterChain chain) {
        if (index == filters.size()) {
            return false;
        }
        final ServletFilter filter = filters.get(index);
        index++;
        return filter.doFilter(request, response, chain);
    }
}