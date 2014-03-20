var BowlingGame = function() {
  this.values = {
    '-' : 0,
    'X' : 10
  }
};

BowlingGame.prototype.calculateTotalScore = function(line) {
  if ((/\d+/).test(line)) {
    return parseInt(line);
  } else {
    return this.values[line];
  }
};