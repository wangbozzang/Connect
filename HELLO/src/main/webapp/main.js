
function display(){
	
	let arr = [];
	let sum = 0;
	for (let i = 0 ; i < 100 ; i++) {
		arr[i] = i+1;
	}
	console.log(arr);
	for (let i = 0 ; i < 100 ; i++) {
		sum += arr[i];
	}
	console.log(sum);
	
	//alert('Hi!');
	document.getElementById("demo").innerHTML="Hello JavaScript!";
}