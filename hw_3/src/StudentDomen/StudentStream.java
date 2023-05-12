package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup>{
    private int numOfStream;
    private List<StudentGroup> groups;

    public StudentStream(int numOfStream, List<StudentGroup> groups) {
        this.numOfStream = numOfStream;
        this.groups = groups;
    }

    public int getNumOfStream() {
        return numOfStream;
    }
 
    public void setNumOfStream(int numOfStream) {
        this.numOfStream = numOfStream;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < groups.size();
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                return null;
            }
        
            return groups.get(index++);
        }
        };
    }
}
