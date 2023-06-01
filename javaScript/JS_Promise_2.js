function checkCanIVote(time, age) {
   // return the output using return keyword
   // do not console.log it

   return new Promise((resolve, reject) => {
      setTimeout(() => {
         if (age >= 18) {
            resolve("You can vote");
         } else {
            reject("You can not vote");
         }
      }, time);
   });
}
