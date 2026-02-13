package U4;

import h3.H;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements j {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f9520b = {8, 13, 11, 2, 0, 1, 7};

    public static void a(int i7, ArrayList arrayList) {
        if (H.x(f9520b, i7, 0, 7) == -1 || arrayList.contains(Integer.valueOf(i7))) {
            return;
        }
        arrayList.add(Integer.valueOf(i7));
    }
}
