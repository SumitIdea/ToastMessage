# ToastMessage
# Step 1. Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://www.jitpack.io' }
		}
	}
# Step 2. Add the dependency

	Tag = 1.0.0  <--- use this version

	dependencies {
	        implementation 'com.github.SumitIdea:ToastMessage:Tag'
	}
  
 # Step 3. Import Library
  
    import com.sumit.toastmessage.AndroidToast

 # Step 4. Code Given Below
              
    AndroidToast().toasterMessage(contextForToast,"Click")
