# MyTools
提供开发过程中常见的工具类，如清理缓存等

**使用方法：**

1. 吐司工具类  
	`ToastUtils.showToast(this,"弹出吐司成功");`

2. 缓存清理工具类  
	`DataClean.cleanApplicationData(this,"文件的路径"); ` 

3. 获取版本号的工具类  
	`VersionUtils.getAppVersionCode(context);`

4. 网络状态判断的工具类  
    `NetWorkUtils  `

5. SD卡操作的工具类，可以获取SD卡的容量等等  
    `SDCardUtils`

**如果你想在项目中使用的话，可以按照以下步骤来使用**

**Step 1.** Add the JitPack repository to your build file 
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

**Step 2.** Add the dependency

	dependencies {
			//参考最新的版本号为准
	        compile 'com.github.clbDream:MyTools:1.4'
	}
