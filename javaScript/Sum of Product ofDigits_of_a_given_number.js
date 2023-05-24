function sumOfProductOfDigits(n1, n2) {
    // Convert the numbers to strings
    const n1Str = n1.toString();
    const n2Str = n2.toString();

    // Initialize the sum
    let sum = 0;

    // Loop through each digit of n1
    for (let i = 0; i < n1Str.length; i++) {
        // Get the corresponding digit from n2
        let digitN2 = 0;
        if (i < n2Str.length) {
            digitN2 = parseInt(n2Str.charAt(n2Str.length - i - 1));
        }

        // Multiply the two digits together and add to the sum
        sum += parseInt(n1Str.charAt(n1Str.length - i - 1)) * digitN2;
    }

    // Return the sum
    return sum;
}