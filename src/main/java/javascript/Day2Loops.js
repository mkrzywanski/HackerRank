function vowelsAndConsonants(s) {
    for (let i = 0; i < s.length; i++) {
        let c = s.charAt(i);
        if (isVowel(c)) {
            console.log(c)
        }
    }
    for (let i = 0; i < s.length; i++) {
        let c = s.charAt(i);
        if (!isVowel(c))
            console.log(c)
    }
}

function isVowel(v) {
    return v === 'a' || v === 'e' || v === 'i' || v === 'o' || v === 'u';
}