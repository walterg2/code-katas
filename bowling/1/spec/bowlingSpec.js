describe("Bowling", function() {
  it("should allow me to create a game", function () {
    var game = new BowlingGame();
  });

  describe("Calculating rolls", function () {
    var game,
      context = [
        {
          roll : "8",
          result : 8
        },
        {
          roll : "1",
          result : 1
        },
        {
          roll : "5",
          result : 5
        },
        {
          roll : '3',
          result : 3
        },
        {
          roll : "-",
          result : 0
        },
        {
          roll : "X",
          result : 10
        }
      ];

    beforeEach(function () {
      game = new BowlingGame();
    });

    context.forEach(function (run) {
      it("can calculate the score from a roll of " + run.roll + " to be " + run.result, function() {
        expect(game.calculateTotalScore(run.roll)).toBe(run.result);
      });

    });

  });
  
});