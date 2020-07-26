package lesson10;

import java.util.Objects;

public abstract class Clothes implements Recommendation {
    private int size;
    private String season;
    private String gender;

    public Clothes() {
    }

    public Clothes(int size, String season, String gender) {
        this.size = size;
        this.season = season;
        this.gender = gender;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Clothes clothes = (Clothes) o;
        return size == clothes.size &&
                Objects.equals(season, clothes.season) &&
                Objects.equals(gender, clothes.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, season, gender);
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size=" + size +
                ", season='" + season + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void clothesAre() {
        System.out.println("Clothes - the things that people wear to cover their body or keep warm");
    }
}
