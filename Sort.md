# 简单排序
### 选择排序和冒泡排序
一: 区别
1.冒泡排序是比较相邻位置的两个数，而选择排序是按顺序比较，找最大值或者最小值；
2.冒泡排序每一轮比较后，位置不对都需要换位置，选择排序每一轮比较都只需要换一次位置；
3.冒泡排序是通过数去找位置，选择排序是给定位置去找数；
二: 冒泡排序优缺点
1.优点:比较简单,空间复杂度较低，是稳定的；
2.缺点:时间复杂度太高，效率慢；
三: 选择排序优缺点
1.优点：一轮比较只需要换一次位置；
2.缺点：效率慢，不稳定（举个例子5，8，5，2，9 我们知道第一遍选择第一个元素5会和2交换，那么原序列中2个5的相对位置前后顺序就破坏了）
