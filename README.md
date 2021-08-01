# plugin_Pic
# 首先

这是一个涩图插件，我爬取了2012至2020年p站的周榜前10页，全部存在了阿里的oss里，你写插件的所有图源均取自这里，以及其他的api。

# 声明

非商业化插件。

## 权重

2020-2012权重依次递减，我需要让bot随机抽图大部分来自于前50%~30%的图库，不应该完全随机，所以权重应该具体划分。

## 图片来源

### 阿里oss

我需要让bot发的每一张图片表明来自于哪一年，图的id是多少，图的作者是谁，图的url是什么（特指oss图片）

### lolicon

一个涩图api，我回头会给你个key和链。

## 图片连发

我需要有指令实现bot的连发图片功能，指连续发图，且不能出现卡顿问题。

## 图片搜搜

提供图片搜搜api，需要指定用户发图后搜索来源后展示。

## 图片提取

通过用户指令获取pid后，通过api或其他手段获取图片并以较为清晰的方式上传。

## 指定图片提取

用户在引用图片连发功能发送的其中一张图片以特定字符时，bot识别并将此图片的高清格式重新发送。

## 图片撤回

要求所有图片可由用户配置是否撤回，以及撤回时间。

## 配置文件

要求有配置文件：配置root用户，配置ban人/群，配置是否允许管理使用，配置是否开启插件，配置是否撤回，配置api选择。

## 图片压缩

要求发送的图片一律采用压缩方式，我会尝试写个压缩的方法。

## 数据来源

阿里云oss，lolicon，我的mysql私人数据库

## 彩蛋

随你添加。

## 结构

多用接口，少用继承。

## 较为难的要求，可以完全不管

### 筛选图片

要求管理员可以将图库删除的部分反馈到服务器，并让服务器删除相关图片资源。

要求每隔7天入库一次图片，并写入数据库。

筛选所有黑白图片并踢出，筛选所有漫画形式图片并踢出。
