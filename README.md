# ToastMessage
# Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://www.jitpack.io' }
		}
	}
# Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.SumitIdea:ToastMessage:Tag'
	}
  
  # Step 4. Import Library
  
  import com.sumit.toastmessage.AndroidToast

  # Step 5. Code Given Below
              
    AndroidToast().toasterMessage(contextForToast,"Click")
