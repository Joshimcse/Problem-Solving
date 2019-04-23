const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

do {
  let n = parseInt(lines.shift());
  if (n === 0 || isNaN(n)) break;
  console.log(`Brasil ${Math.floor(n / 90 * 1)} x Alemanha ${Math.ceil(n / 90 * 7)}`);
} while (true);