describe("Bowling", function() {
  it("should allow me to create a game", function () {
    var game = new BowlingGame();
  });

  describe("Calculating rolls", function () {
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

    it("can calculate a score from a non-special roll", function() {
      expect(game.calculateTotalScore("8")).toBe(8);
      expect(game.calculateTotalScore("2")).toBe(2);
      expect(game.calculateTotalScore("4")).toBe(4);
      expect(game.calculateTotalScore("3")).toBe(3);
    });

  });
});