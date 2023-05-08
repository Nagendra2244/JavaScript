<!DOCTYPE html>
<html>
<body>
	<h1>JavaScript Array</h1>
	<p id="p1"></p>
	<p id="p2"></p>
	<p id="p3"></p>
		
	<script>
		var stringArray = new Array();
		stringArray[0] = "one";
		stringArray[1] = "two";
		stringArray[2] = "three";
		stringArray[3] = "four";

		var numericArray = new Array(3);
		numericArray[0] = 1;
		numericArray[1] = 2;
		numericArray[2] = 3;

		var mixedArray = new Array(1, "two", 3, "four");

		document.getElementById("p1").innerHTML = stringArray;
		document.getElementById("p2").innerHTML = numericArray;
		document.getElementById("p3").innerHTML = mixedArray;
    </script>
</body>
</html>