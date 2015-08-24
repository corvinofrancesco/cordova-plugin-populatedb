= Populate Database Plugin =
When create a mobile application and you use a sqlite database, you need to populate it.

You can execute each line sql, I found some examples in: stackoverflow thread [how to run db scripts after installation and-update of the phonegap android appl](http://stackoverflow.com/questions/19093231/how-to-run-db-scripts-after-installation-and-update-of-the-phonegap-android-appl) and [Raymond Camden Blogs](http://www.raymondcamden.com/2013/08/14/Updating-PhoneGap-Databases).
	
Otherwise, I think to create a cordova plugin that execute the population procedures in  native code. I will follow for [android](http://stackoverflow.com/questions/2409126/android-pre-populated-database) and [ios](https://developer.apple.com/library/ios/samplecode/CoreDataBooks/Listings/Classes_RootViewController_m.html#//apple_ref/doc/uid/DTS40008405-Classes_RootViewController_m-DontLinkElementID_14).

Other solutions can be coping the sqlite database from file (example at this [link](http://gauravstomar.blogspot.it/2011/08/prepopulate-sqlite-in-phonegap.html?utm_source=feedburner&utm_medium=feed&utm_campaign=Feed:+GauravSTomarBootstrappingIntelligence+%28Gaurav+S+Tomar+:+Bootstrapping+Intelligence%29) ).

I found also this thread on stackoverflow: [Pre populate client database with Phonegap primary target android](http://stackoverflow.com/questions/9004428/pre-populate-client-database-with-phonegap-primary-target-android).

