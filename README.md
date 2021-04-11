# TestTaskToJetBrains

I maid a special class ```MatchClass``` with a timer that interrupts the execution of a function if the time allotted for it's execution has expired.
The class also allows the function to terminate correctly if an exception is thrown during its execution.

```MatchClass``` has only public static method ```matches()``` which returns ```true``` if the text matches regex, the check took the correct amount of time and no exceptions were thrown, and ```false``` otherwise. 
