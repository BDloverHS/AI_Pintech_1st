package exam01;

public enum Transportation {
    // 순서를 바꾸면 ordinal 값도 바뀜
    BUS("버스") {
        @Override
        public int getTotal(int person) {
            return 1500 * person;
        }
    },
    SUBWAY("지하철") {
        @Override
        public int getTotal(int person) {
            return 1400 * person;
        }
    },
    TAXI("택시") {
        @Override
        public int getTotal(int person) {
            return 4500 * person;
        }
    };

    /**
     * 오류 메세지 : 제어자 'public'은(는) 허용되지 않습니다
     * public Transportation() {
     *
     * }
     */

    private final String title;

    Transportation(String title) { // private
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract int getTotal(int person);
}