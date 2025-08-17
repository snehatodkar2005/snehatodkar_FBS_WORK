    function applyBorder() {
            table = document.getElementById("myTable");

            cbWidth = document.getElementById("widthCheckbox");
            cbType = document.getElementById("typeCheckbox");
            cbColor = document.getElementById("colorCheckbox");

            if (cbWidth.checked && cbType.checked && cbColor.checked) 
            {
                table.style.borderWidth = document.getElementById("widthofborder").value + "px";
                table.style.borderStyle = document.getElementById("selectborder").value;
                table.style.borderColor = document.getElementById("colorofborder").value;
            }
            else if (cbWidth.checked && cbType.checked) 
            {
                table.style.borderWidth = document.getElementById("widthofborder").value + "px";
                table.style.borderStyle = document.getElementById("selectborder").value;
            }
            else if (cbWidth.checked && cbColor.checked) 
            {
                table.style.borderWidth = document.getElementById("widthofborder").value + "px";
                table.style.borderColor = document.getElementById("colorofborder").value;
            }
            else if (cbType.checked && cbColor.checked) 
            {
                table.style.borderStyle = document.getElementById("selectborder").value;
                table.style.borderColor = document.getElementById("colorofborder").value;
            }
            else if (cbWidth.checked) 
            {
                table.style.borderWidth = document.getElementById("widthofborder").value + "px";
            }
            else if (cbType.checked) 
            {
                table.style.borderStyle = document.getElementById("selectborder").value;
            }
            else if (cbColor.checked) 
            {
                table.style.borderColor = document.getElementById("colorofborder").value;
            }
        }s