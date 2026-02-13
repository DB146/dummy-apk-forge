package B0;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class O implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1767b;

    public /* synthetic */ O(Object obj, int i7) {
        this.f1766a = i7;
        this.f1767b = obj;
    }

    public O(Comparator comparator) {
        this.f1766a = 0;
        this.f1767b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1766a) {
            case 0:
                int compare = ((Comparator) this.f1767b).compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return A0.L.f42f0.compare(((H0.n) obj).f4504c, ((H0.n) obj2).f4504c);
            case 1:
                int compare2 = ((O) this.f1767b).compare(obj, obj2);
                return compare2 != 0 ? compare2 : q3.f.h(Integer.valueOf(((H0.n) obj).g), Integer.valueOf(((H0.n) obj2).g));
            default:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.f15238C).compareTo(Boolean.valueOf(materialButton2.f15238C));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f1767b;
                return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
        }
    }
}
