const carouselSlide = document.querySelector('.slide')
const carouselImage = document.querySelectorAll('.slide-move img')


const prevBtn = document.querySelector('#prevbtn')
const nextBtn = document.querySelector('#nextbtn')


let counter= 1

const size= carouselImage[0].clientWidth


carouselSlide.style.transform="translateX("+(-size*counter)+"px)"


nextBtn.addEventListener("click",()=>{
    if(counter>=carouselImage.length-1)return
    carouselSlide.style.transition = "transform 0.5s ease-in-out"
    counter++;

    carouselSlide.style.transform="translateX("+(-size*counter)+"px)"
})

prevBtn.addEventListener("click",()=>{
    if(counter<=0)return
    carouselSlide.style.transition = "transform 0.5s ease-in-out"
    counter--;

    carouselSlide.style.transform="translateX("+(-size*counter)+"px)"
})




carouselSlide.addEventListener("transitionend", ()=> {
    
    if(carouselImage[counter].id==="lastClone"){
        carouselSlide.style.transition = "none" 
        
        counter=carouselImage.length-2
        carouselSlide.style.transform="translateX("+(-size*counter)+"px)"
    }
    if(carouselImage[counter].id==="firstClone"){
        carouselSlide.style.transition = "none" 
        
        counter=carouselImage.length-counter
        carouselSlide.style.transform="translateX("+(-size*counter)+"px)"
    }
})




// log in

function gmail(){
    const gmail =document.getElementById("gmail_inp").value
    const password =document.getElementById("password_inp").value

    if(gmail==="levan.tchitchadze@gau.edu.ge" , password==="tchitchadze"){
        alert("გამარჯობა ბატონო ლევან! კეთილი იყოს თქვენი მობრძანება")
    }

    console.log(gmail)
}

const chekbox=document.getElementById("chbox")
const head =document.getElementById("header")

chekbox.addEventListener("change",()=>{
    const slr =document.getElementById("sld-mover")

    head.classList.toggle("red")
    slr.classList.toggle("red1")
})

//languages

// const lanEl=document.querySelector(".langWrap")
// const link=document.querySelectorAll("a")
// const titleEl=document.querySelector(".title")
// const descrEl=document.querySelector(".description")

// link.forEach(el =>{
//     el.addEventListener("click", ()=>{
//         langEl.querySelector(".active").classList.remove(".active")
//         el.classList.add("active")

//         const attr=el.getAttribute('language')
//         titleEl.textContent=data[attr].title

//     })
// })

// // var data={
//     "English":{
//             "title":"Wagner",
//             "description":`I am fascinated by this statue, captive by sea-ascent -
//             Wagner, holy as heaven and dark as the underworld.
//             Wagner, creator of the beauty of dissonances,
//             Slowly captivating, exciting, hurtful.
//             I hear the chaos of a quiet shriek as the country is created
//             And the ascension of the Creator to precede the inspiring seconds
//             And a face tormented by the feeling of melodies
//             And I dream of a whirlwind of abuse asleepA century
//             goes by and everything that happens will be forgotten
//             in a quiet silence: the ever-burning tunes of Loengrines
//             Tsad Mkvani, the sad excerpts of Isolde and Tristan, the excerpt
//             of which is created by the sea-passion, the melody of the search for a new one, .`},

//     "Georgian":{
//             "ttitle":"ვაგნერი",
                
//             "description":`მე მხიბლავს ეს ქანდაკება, ზღვა-აღმაფრენით ტყვემქნელი -
//                         ვაგნერი, წმინდა, ვით ზეცა და ბნელი, როგორც ქვესკნელი.
//                         ვაგნერი, დისსონანსების მშვენიერებათ შემქნელი,
//                         ნელი-ნელ მატყვევებელი, ამღელვებელი, მვნებელი.
//                         მე მესმის წყნარი შრიალით ქაოსი ქვეყნის შექმნის დროს
//                         და აღმაფრენა შემქნელის, რომ ზეშთამგონელ წამს უსწროს
//                         და სახე მელოდიების განცდით წამებულ-ვნებული
//                         და მესიზმრება გრიგალი ბოროტად მიძინებული.
//                         წარვლიან საუკუნენი და ყოველივე, რაც ხდება,
//                         ისევე წყნარი დუმილით დავიწყებაში გაჩნდება:
//                         მარად დამწველი ჰანგები ლოენგრინესი
//                         ცად მყვანის, მწუხარე ამონაკვნესი იზოლდასი და  
//                         ტრისტანის, ამონაკვნესი, რომელსაც მომხიბვლელად 
//                         ქმნის ზღვა-ვნება, ჰანგი ახალის ძიების,
//                         სიმღერა ვალკირიების - სამარადისო, დაუჭკნობ და წმინდა ძეგლად დარჩება.`}
            
// }


