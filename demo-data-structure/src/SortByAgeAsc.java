public class SortByAgeAsc implements Comparator <Person1>{
  
@Override
public int compareTo (Person person){
  return this.age > person.getAge() ? -1 : 1;

  @Override
}
}
