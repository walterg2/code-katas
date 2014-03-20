var BowlingGame = function() {
  this.values = {
    '-' : 0,
    'X' : 10
  }
};

BowlingGame.prototype.calculateTotalScore = function(line) {
  return this.values[line];
};