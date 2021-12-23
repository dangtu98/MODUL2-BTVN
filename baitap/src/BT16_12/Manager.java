package BT16_12;

public interface Manager {
    void disPlayAll();

    void addHuman(Human human);

    Human searchHumanId(int id);

    Human deleteHumanId(int id);

    Human editHumanId(int id);

    void sortByAverages();

    double totalAverages();

}
