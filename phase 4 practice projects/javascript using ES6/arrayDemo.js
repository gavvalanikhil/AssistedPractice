// // //creating array using literal style
// // let num1=[];
// // //creating array using new keyword
// // let num2= new Array();
// // //creating array using literal style with few values.
// // document.write("size of the array "+num1.length)
// // document.write("<br/>size of the array "+num2.length)
// // let num3=[10,20,30,40]
// // document.write("<br/>size of the array "+num3.length)
// // document.write("<br/>All the elements in the array "+num3)
// // num3.push(100);
// // num3.push(200);  //add element at last
// // num3.unshift(1);
// // num3.unshift(2); //adds in the beginning
// // document.write("<br/>All the elements in the array "+num3);
// // num3.pop(); //removes elements from last
// // num3.shift();   //removes elements from the beginning
// // document.write("<br/>All the elements in the array "+num3);
// // document.write("<br/>")
// // document.writeln(typeof(num2))
// // document.write(typeof(num1))
// let num4 = [10,20,30,40,50];
// //splice: using this method we can add,remove elements in between array
// document.write("<br/> "+num4)
// document.write("<br/> 0 position value  "+num4[0]);
// document.write("<br/> 1 position value  "+num4[1]);
// //num4.splice(1,1);        //1st paramenter shows the starting index pos and 2nd parameter shows the count from the start point
// //num4.splice(1,2);        //1st paramenter shows the starting index pos and 2nd parameter shows the count from the start point

// //add 200 in 1 index position
// //num4.splice(1,0,200);      //1st paramenter shows the starting index pos and 2nd parameter shows the count from the start point
//                            //3rd parameter adds the value 20
// //num4.splice(1,0,111,222,333); //from 1 index position adding 3 elements as 111,222,333
// num4.splice(1,2,111,222,333);
// document.write("<br/> "+num4)