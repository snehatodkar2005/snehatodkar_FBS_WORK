function print1()
{
    document.getElementById("inputbox").value+="1";
}
function print2()
{
    document.getElementById("inputbox").value+="2";
}
function print3()
{
    document.getElementById("inputbox").value+="3";
}
function print4()
{
    document.getElementById("inputbox").value+="4";
}
function print5()
{
    document.getElementById("inputbox").value+="5";
}
function print6()
{
    document.getElementById("inputbox").value+="6";
}
function print7()
{
    document.getElementById("inputbox").value+="7";
}
function print8()
{
    document.getElementById("inputbox").value+="8";
}
function print9()
{
    document.getElementById("inputbox").value+="9";
}
function print0()
{
    document.getElementById("inputbox").value+="0";
}




function printadd()
{
    document.getElementById("inputbox").value+="+";
}
function printsub()
{
    document.getElementById("inputbox").value+="-";
}
function printmul()
{
    document.getElementById("inputbox").value+="*";
}
function printdiv()
{
    document.getElementById("inputbox").value+="/";
}
function printequal()
{
    document.getElementById("inputbox").value+="=";
}
function floatingpoint() 
{
    document.getElementById("inputbox").value+=".";
}
function clearall()
{
    document.getElementById("inputbox").value="";
}
function backspace()
{
    let current=document.getElementById("inputbox").value;
    document.getElementById("inputbox").value=current.slice(0,-1);
}
function printequal()
{
    let res=document.getElementById("inputbox").value;
    document.getElementById("inputbox").value=eval(res);
}