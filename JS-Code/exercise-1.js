// alert("Hello World");   //弹窗Hello World
// console.log("Hello World");  //控制台输出Hello World

// a=3.1415123;
// alert(typeof a);


document.write("<div class=\"QQ\"><p>鼠标划过+鼠标离开触发</p></div>")
document.write("<div class=\"QQ\"><p>双击触发<\p></div>")
document.write("<div class=\"QQ\"><p>单击触发<\p></div>")
document.write("<input type=\"text\" id=\"abc\"/ value=\"任意键盘按下触发\">")


// 通过js设置css
var bd=document.body.style
// alert(typeof bd)
bd.background="linear-gradient(rgb(186, 228, 186),rgb(251, 202, 128))"
bd.height="100vh"
bd.display="flex"
bd.justifyContent="center"
bd.alignItems="center"

var qq=document.getElementsByClassName("QQ")
for(i=0;i<=qq.length-1;i++){
    qq[i].style.height= "100px"
    qq[i].style.width= "100px"
    qq[i].style.backgroundColor= "rgb(100, 100, 100)"
    qq[i].style.borderRadius= "20px"
    qq[i].style.margin="10px"
    qq[i].style.color="white"
    qq[i].style.padding="10px"
    qq[i].style.display="flex"
    qq[i].style.justifyContent="center"
    qq[i].style.alignItems="center"
    qq[i].style.transition="0.5s ease-in-out"
}

var aa=document.getElementById("abc").style
aa.height="100px"
aa.width="100px"
aa.borderRadius= "20px"
aa.padding="10px"
aa.margin="10px"
aa.borderStyle="none"

window.onload=function(){
    qq[0].onmouseover=function(){
        document.body.style.background="linear-gradient(rgb(100, 228, 186),rgb(200, 202, 128))"
    }
    qq[0].onmouseout=function(){
        document.body.style.background="linear-gradient(rgb(186, 228, 186),rgb(251, 202, 128))"
    }
    qq[1].ondblclick=function(){
        alert("hello world")
    }
    qq[2].onclick=function(){
        qq[2].style.height="200px"
    }
    qq[2].onmouseout=function(){
        qq[2].style.height="100px"
    }
    document.getElementById("abc").onkeydown=function(){
        bd.background="linear-gradient(rgb(33, 150, 186),rgb(200, 22, 128))"
    }
    document.getElementById("abc").onmouseout=function(){
        bd.background="linear-gradient(rgb(186, 228, 186),rgb(251, 202, 128))"
    }
}

