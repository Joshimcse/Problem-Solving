let input = require('fs').readFileSync('./dev/stdin', 'utf8');
let lines = input.split('\n');

let isFirstTestCase = true;

while (true) {
    let n = parseInt(lines.shift());

    if (n === 0) {
        break;
    } else {
        if (isFirstTestCase) isFirstTestCase = false;
        else console.log();

        let str = '',
            strArray = [],
            maxln = -1;
        for (i = 0; i < n; i++) {
            str = lines.shift().replace(/ +/g, " ").trim();
            if (str.length > maxln) maxln = str.length;
            strArray.push(str);
        }

        for (i = 0; i < n; i++) {
            if (strArray[i].length < maxln) {
                let extraSpace = maxln - strArray[i].length;
                let strWithSpace = '';
                while (extraSpace--) {
                    strWithSpace += ' ';
                }
                strWithSpace += strArray[i];
                console.log(strWithSpace);
            } else {
                console.log(strArray[i]);
            }
        }
    }
}