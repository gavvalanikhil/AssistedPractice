function removeData(){
    sessionStorage.removeItem("obj1");
    localStorage.removeItem("obj2");
    // alert("Data Removed...");
    document.getElementById("out").innerHTML="Data Removed..."
}