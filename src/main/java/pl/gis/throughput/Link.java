package pl.gis.throughput;

public class Link implements Comparable<Link> {
        public final int src;
        public final int dst;
        public final int wgt;
 
        public Link(int src, int dst, int wgt) {
            this.src = src;
            this.dst = dst;
            this.wgt = wgt;
        }
 
        @Override
        public int compareTo(Link o) {
            if (o == null || o.wgt < wgt) return 1;
            if (o.wgt > wgt) return -1;
            return 0;
        }
 
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Link)) return false;
            Link link = (Link) o;
            return (src == link.src && dst == link.dst && wgt == link.wgt);
        }
 
        @Override
        public int hashCode() {
            int result = src;
            result = 31 * result + dst;
            result = 31 * result + wgt;
            return result;
        }
 
        @Override
        public String toString() {
            return String.format("Link[%d -> %d : %d]", src, dst, wgt);
        }
    }