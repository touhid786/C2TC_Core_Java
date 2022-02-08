package VIDEO_1;

public class DateTimeIntro {
	
	/*
	Drawbacks of existing Date/Time API's
	
	Thread safety: 
		The existing classes such as Date and Calendar does not provide thread safety. 
		Hence it leads to hard-to-debug concurrency issues that are needed to be taken care by developers. 
		The new Date and Time APIs of Java 8 provide thread safety and are immutable, hence avoiding the concurrency issue from developers.
	
	Bad API designing:
	  The classic Date and Calendar APIs does not provide methods to perform basic day-to-day functionalities. 
	  The Date and Time classes introduced in Java 8 are ISO-centric and provides number of different methods for performing operations regarding date, time, duration and periods.
	
	Difficult time zone handling: 
		To handle the time-zone using classic Date and Calendar classes is difficult because the developers
		were supposed to write the logic for it. With the new APIs, the time-zone handling can be easily done with Local and ZonedDate/Time APIs.

*/
}
