# MyTools
提供开发过程中常见的工具类，如清理缓存等

如果你想在项目中使用的话，可以按照以下步骤来使用

Step 1. Add the JitPack repository to your build file 
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

	dependencies {
	        compile 'com.github.clbDream:MyTools:1.1'
	}
