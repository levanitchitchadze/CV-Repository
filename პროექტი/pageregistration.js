
            
 


        function reg(){

            const mail =document.getElementById("gmail").value
            
            
            var i=0
            while(mail.length>i){
                if(mail[i]==="@"){
                
                    if(mail.length-i>=3){
                        a=document.getElementById("h11").innerHTML="mail is Correct"
                        }else{
                            a=document.getElementById("h11").innerHTML=""
                        }

                    }
                

                
                i++
            }



            
            
        }

        setInterval(reg,100)

        


        // password line

        const pass= document.getElementById('password')
        
        pass.addEventListener("keyup",()=>{
            checkPassword(pass.value)
        })

        function checkPassword(password){
            var strength = 0

            if(password.match(/[a-zA-Z]+/)){
                strength+=1

            }
            if(password.match(/[0-9]+/)){
                strength+=1

            }
            if(password.match(/[!@#$%^&*()]+/)){
                strength+=1

            }
            if(password.length>=6){
                strength+=1
            }
            h12=document.getElementById("h12")
            switch(strength){
                case 0:
                    h12.innerHTML="ძალიან სუსტი"
                    break
                case 1:
                    h12.innerHTML="სუსტი"
                    break
                case 2:
                    h12.innerHTML="საშუალო"
                    break
                case 3:
                    h12.innerHTML="ძლიერი"

                    break
                case 4:
                    h12.innerHTML="ძალიან ძლიერი"

                    break
            }

        }







