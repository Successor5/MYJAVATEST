let word = "Mississippi"
countS = 0
countI = 0
for(let i =  0; i < word.length; i++){
   if (word[i] === "s"){
      countS++
   }else if (word[i]=== "i"){
      countI++
   }
}
console.log(countI)
console.log(countS)
 