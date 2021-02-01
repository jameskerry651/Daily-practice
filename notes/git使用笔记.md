#git使用方法简介

*git是一个分布式的管理代码的工具，不管是对于个人开发而言还是协同开发，都有极大的*
*便利性，有时候控制软件版本，或者要修改以前版本的软件都是非常方便。*

##理解git工作流程
git是有 **工作区**，**暂存区**，**本地仓库**，**远程仓库**的概念。
写好的代码可以add到暂存区，核验完毕后，可以commit提交到本地仓库，如果有远程仓库，还可以push上去。


##实践出真知
1.下载git软件，直接搜索下载安装即可

2.初始化本地仓库
在工作区域的文件夹处，点击鼠标右键，再点击git bash或者在文件夹处打开cmd使用git
,输入以下命令，初始化完成后，会生成.git的隐藏文件，里面是关于仓库的配置
>git init

3.配置git使用者信息,输入如下：

>git config --global user.name "your name"

>git config --global user.email "your email address"

4.新建一个test.txt 文件在文件夹下，然后在bash输入（查看状态）
>git status

![git status](https://github.com/jameskerry651/Daily-practice/tree/main/notes/pictures/git_status.png)
我们可以看到有一个未追踪的文件 test.txt

我们输入
>git add test.txt

然后再查看状态
>git status

![](https://github.com/jameskerry651/Daily-practice/tree/main/notes/pictures/git_status2.png)
此时的test.txt从工作区进入到暂存区，当然工作区的文件依旧存在

现在我们要第一次提交文件
>git commit test.txt -m "第一次提交"

然后我们在text.txt中加入 *123*，随意修改都可以
完成后输入
>git add .
> 
> git commit . -m "第一次修改后提交，加入了123"

注意：add 和 commit后面本身应该加上文件名，不过.匹配了所有文件，也就是一次提交多个文件

5.现在我们打开日志，查看提交记录(两种命令都可以)
>git log
>git reflog

![日志](https://github.com/jameskerry651/Daily-practice/tree/main/notes/pictures/git_reflog.png)
可以看到我们的提交记录，假如说我们的修改错误，需要滚回第一次提交的代码
>git reset --hard HEAD^

表示回滚一次，现在就回到了第一次提交的代码了
![回滚](https://github.com/jameskerry651/Daily-practice/tree/main/notes/pictures/git_reset.png)
假如说回到前10次修改的代码呢？
>git reset --hard HEAD^10


---
##git 关于远程仓库的使用

事实上，github和git是可以配套使用的，假如要想克隆别人的项目到本地，只需要知道url就可以只需要一条
命令便可以轻松搞定
比如我的日常练习
>git clone https://github.com/jameskerry651/Daily-practice

就可以把仓库的文件和代码都下载到本地修改

###git配合github仓库使用

* 首先需要在github上注册一个账号，然后创建自己的仓库（详情百度即可）

* 然后把github的仓库clone到本地，每次修改提交后，使用
>git push 

就可以同步更新远程仓库，不过需要输入账号和密码。当然现在的idea都是非常智能的，可以通过
token或者密钥等方式免密登录

甚至于根本不需要命令行都可以完成提交和Push等操作

git配合github也不只是可以用来存放代码，也可以放一些资源，或者比如老师布置的作业，
可以用github保存，到机房的时候直接clone到电脑上就可以了