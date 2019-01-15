const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const value = parseInt(input.split('\n').shift());

if (value % 2 == 1) {
    console.log(value + 1);
} else {
    console.log(value + 2);
}