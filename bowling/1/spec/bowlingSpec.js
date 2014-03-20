describe("Bowling", function() {
  it("should allow me to create a game", function () {
    var game = new BowlingGame();
  });

  describe("Calculating special scores", function () {
    var game;

    beforeEach(function () {
      game = new BowlingGame();
    });

    it("can calculate a score for a miss", function () {
      expect(game.calculateTotalScore("-")).toBe(0);
    });

    it("can calculate a score from a strike", function() {
      expect(game.calculateTotalScore("X")).toBe(10);
    });

  });
});