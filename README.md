# [WowsHelper](https://github.com/Orisland/JMiraiFrame/tree/wows-dev)
> [战舰世界](https://eu.wargaming.net/en/games/wows) 国际服每日战绩查询插件

![我跟你说，窝窝屎狗都不玩](/assets/uploads/files/1653490878249-0197f0e3-c2e4-416d-aab1-3143c7629604-image.png)

[![Mirai](https://img.shields.io/badge/Mirai-bot-green)](https://github.com/mamoe/mirai)
[![GitHub release (latest by date)](https://img.shields.io/github/downloads/Orisland/JMiraiFrame/latest/total)](https://github.com/Orisland/WowsHelper/releases/tag/WowsChef-0.2.4)


>在本群出现的插件问题会被开发者最快看到，您也可以直接在该群中进行战绩查询.
>
>*我不能容忍这么大的论坛里没有窝窝屎的痕迹(**
### 本插件的开发初衷(**重要**):
>
>客观原因：
> 本插件存在的意义是因为yuyuko
> ![image](/assets/uploads/files/1653490589998-00046bd2-6112-4327-8bfc-7ebcaf35cc94-image.png)
>不知道是因为bot本身的原因还是作者禁止了其他群的使用，反正在我所在的亲友窝窝屎群里是用不了了，也不知道如何才能恢复，等啊等，最终等不来了，决定自己摸一个。
>
>主观原因：
>我不想让我的数据掌握在其他人的手里，并由其他人管理。我认为任何玩家的数据都应该只能由玩家个人和游戏开发商掌握，yyk的无条件的同步玩家数据，且一直更新的行为我个人对此抱有一些看法。
>如果可以，玩家有权利停止向任何网站停止自己的数据公布，而不是必须在游戏内配置隐藏战绩以躲避数据同步。综上，我认为原本yyk的同步做法会产生所谓的数据绑架问题。所以，也是基于这个角度，本bot的数据全部存放本地，玩家解绑后数据将同时停止更新，玩家可以自由的选择是否公开自己的数据，这是我认为比较合适的做法。
>以上观点仅代表个人，如果您不同意请直接无视，并选择yyk，yyk的图形化显示确实比较强大。
>


### 注意事项
**本插件处于初版本A测中**，不可避免的会出现各种**神秘的bug**等问题，如果遇到了各种莫名其妙的异常，请截图聊天记录发issue(**如果您不想在issue中出示您的战绩，请通过mirai站内信私聊我**)，请在issue中附带异常文本，请勿发送只含有部分异常的截图。

### 当前部分功能截图一览
>![5e356bf7-5963-43bf-8afa-a8b6b8d63a58-image.png](/assets/uploads/files/1654483158678-5e356bf7-5963-43bf-8afa-a8b6b8d63a58-image.png)
>
>![c9a96c68-ce48-40d6-94a3-2edf665aca6f-image.png](/assets/uploads/files/1654483197662-c9a96c68-ce48-40d6-94a3-2edf665aca6f-image.png)
>
>![4a7683ca-a1a7-4c9d-9fc4-fc791002ddc7-image.png](/assets/uploads/files/1654483332572-4a7683ca-a1a7-4c9d-9fc4-fc791002ddc7-image.png)
>
>![38762434-e354-4c6e-9edd-6dc0971aaf4d-image.png](/assets/uploads/files/1654483252232-38762434-e354-4c6e-9edd-6dc0971aaf4d-image.png)
>

###  指令一览
> ^fold
>
>功能较多，安装插件后直接w help比这里说快的多。
>![86298108-4949-4707-a006-8b7e3013100b-image.png](/assets/uploads/files/1653881689683-86298108-4949-4707-a006-8b7e3013100b-image.png)
>


###  安装前的必要步骤：[developers](https://developers.wargaming.net/applications/)
> ^fold
>
> * 登陆[developers](https://developers.wargaming.net/applications/)，登陆您的wg账号。
>
> * 创建应用![0f84c16d-98f0-4cb3-9418-ea54c7890b24-image.png](/assets/uploads/files/1653498673089-0f84c16d-98f0-4cb3-9418-ea54c7890b24-image.png)
>
> * 选择手机版随便起个什么应用的名字
>
> ![ce568c6e-bb9a-47cf-98f4-bc93c2a5e07f-image.png](/assets/uploads/files/1653498728471-ce568c6e-bb9a-47cf-98f4-bc93c2a5e07f-image.png)
>
> * 进入新建的应用详情，记录马赛克的application id部分
>
> ![d856c678-8f99-4f45-9833-688057d9b04a-image.png](/assets/uploads/files/1653498842766-d856c678-8f99-4f45-9833-688057d9b04a-image.png)

###  以下为正常的插件安装步骤
> ^fold
>
> 前往gayhub下载zip
>  解压两个文件,拖入plugins
>  启动bot，关闭bot
> 打开mirai根目录config\org.orisland.plugin
> 编辑config.yml，将刚才的application Id填入appid: 引号可加可不加
> 重启bot## 授予用户所需权限，授予自己全部权限.
[如何授权？](https://docs.mirai.mamoe.net/console/Permissions.html#%E8%A2%AB%E8%AE%B8%E5%8F%AF%E4%BA%BA-id)

###  插件权限一览：
> ^fold
>
> 应该给予成员的权限
> org.orisland.plugin:command.wws                  ->基础指令
> org.orisland.plugin:command.wws-help       ->帮助
> org.orisland.plugin:command.wws-bind       ->玩家绑定
>
> 不应该给予成员的权限：
> org.orisland.plugin:command.wws-controller    ->数据操作

### 目前没有支持国服的计划，~~未来也不会有~~，未来可能有。

## 重要的FQA
> ^fold
>
> * 为什么不做图形化？
    > 懒。
>
> * yyk支持了xxx功能，你这支持吗？
    > 如果您需要更为强大的数据展示，请选择yyk。
>
> * 我不同意你在初衷里提到的观点。
    > 请选择yyk，yyk在功能上更为强大。
>
> * 我为什么要用你这个插件？
    > 如果你使用水表插件的原因只是娱乐目的，且群内对于水表数据较为敏感，该插件的食堂图片可以缓解该问题，粗略的水表可以降低玩家之间因数据冲突而造成的隔阂，数据转发机制确保使用者在bot查询出其他人的水表时提供类似于古代屏风功能的视觉缓冲。
>
> * 你的插件比yyk有什么优势吗？
    > 如上。
>
> * 你的插件完全开源吗？包括数据算法？
    > 是的，您可以在仓库中看到所有数据的比较算法，完全公开，透明，您发现问题请及时发送issue，我在看到问题并核实后会尽快修正。（当然我开源指的不是毛子的api数据源，我只负责获取数据并包装官方数据源）
>
> * 国服有希望吗？
    > 在360公开国服的数据api之前，没什么希望，我不太想通过爬虫的方式爬取用户的数据。
>
> * 这么多蔬菜，后续还会更新吗？
    > 当然，如果您想，您也可以自行添加您喜欢的蔬菜！蔬菜的数据文件在【mirai】\data\org.orisland.plugin\prImg，您可以根据级别放置不同的图片，您当然也可以修改或替换已有蔬菜的名称！
>
> * 为什么我在这里查到的数据和yyk/numbers/info不一样？
    > pr算法完全一致，插件每天将自动同步船只期望数据，不排除算法有误，欢迎指出。
>
> * 插件需要科学吗？
    > 插件自带重试机制，毛子的数据api查询速度一般情况下很快，失败了会重试，无需科学，但是**稳定**的科学可以让bot的查询速度更快！
>
> * 为什么没有潜艇？yyk有潜艇数据，一些实时战绩插也有潜艇！
    > 因为毛子的api没有数据，毛子的api已经死了，我在使用时尸体查询。我说过，我不太想爬取用户数据，潜艇目前的查询方式只能通过爬取用户的网页个人数据得到。
>
> * 这个插件适合初学者阅读代码学习mirai吗？
    > 适合。因为没有任何高深的处理，全部是静态方法处理数据。


>没人看的更新日志

> 
> v0.2.2
> 添加了更多食材，并允许使用者自行添加食材！
> 修复了因为玩家绑定后隐藏战绩而导致的数据更新错误问题
> 修复了一些错别字
> KD计算方法修正，现在KD为场均
> 2022年6月4日10:36:13
>
> v0.2.1
> 添加真正的大茄子！
> 更大！更强的茄子！
> 2022年5月31日01:42:47
>
> v0.2
> 支持了rank战绩查询
> 完善了指令模块
> 完善了帮助模块
> 增加了管理员模块，允许管理员进行危险性较大的数据操作
> 重新包装了信息，现在信息将不会直接展示
> 2022年5月30日11:28:45
>
> v0.1
> 基本功能发布
> 2022年5月26日01:37:18