# 2019-10-20

## 1. 已完成的功能:

### a. Usr

- [x] 注册功能已完成: 采用第三方登录模式,获取第三方给的**uid**, **name**,**head**, **gender**创建一个新的用户

```
@ResponseBody
    @RequestMapping(value = "/user/register")
    public String usrRegister(@RequestParam String uid, @RequestParam String name, @RequestParam String head, @RequestParam String gender) {
        return "{\"result\": \"" + UserService.Register(uid, name, head, gender) + "\"}";
    }
```

- [x] 修改用户信息功能已完成: 用户修改自己的信息,将修改的信息参数更新至数据库, 需要使用id作为定位

```
@ResponseBody
    @RequestMapping(value = "/user/modify")
    public String modifyInfo(@RequestParam String name, @RequestParam String head, @RequestParam String gender, @RequestParam String profile, @RequestParam String id) {
        return "{\"result\": \"" + UserService.modifyInfo(name, head, gender, profile, id) + "\"}";
    }
```

### b. activity

- [x] 动态发布功能已完成: 将新的动态信息插入至数据库; 其中, `actImageRef`为可选参数

```
@ResponseBody
    @RequestMapping(value = "/activity/post")
    public String postActivity(@RequestParam String actType, @RequestParam String actUsr, @RequestParam String actContent, String actImageRef, @RequestParam String actMovie) {
        return "{\"result\": \"" + ActivityService.postActivity(actType, actUsr, actContent, actImageRef, actMovie) + "\"}";
    }
```

## 2. 待解决问题

**查看 TODO**

## 3. 目录结构说明

- [ ] lib: 项目引用的jar包
- [ ] out: 编译输出文件
- [ ] src: 源代码文件
    - [ ] com.imovie: 源代码
        - [ ] bean: 实体类
        - [ ] config: 项目配置文件
        - [ ] controller: 控制器
        - [ ] dao: Database Access Object
        - [ ] mapper: Mybatis识别
        - [ ] service: 服务功能核心代码
        - [ ] util: 工具类
    - [ ] mock: 数据模拟json文件
- [ ] web: 服务器端使用的文件
    - [ ] WEB_INF:
        - [ ] classes: 编译输出文件
        - [ ] lib: jar包
        - [ ] VIEW: 视图文件
        - [ ] web.xml: Spring MVC配置文件