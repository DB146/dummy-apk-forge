package H0;

/* loaded from: classes.dex */
public final class f {
    public static final boolean a(int i7, int i10) {
        return i7 == i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        ((f) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(5);
    }

    public final String toString() {
        return a(5, 0) ? "Button" : a(5, 1) ? "Checkbox" : a(5, 2) ? "Switch" : a(5, 3) ? "RadioButton" : a(5, 4) ? "Tab" : a(5, 5) ? "Image" : a(5, 6) ? "DropdownList" : a(5, 7) ? "Picker" : a(5, 8) ? "Carousel" : "Unknown";
    }
}
