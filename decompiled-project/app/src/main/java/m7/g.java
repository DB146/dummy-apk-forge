package m7;

import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f20764a = new Object();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (str == null) {
            return str2 != null ? -1 : 0;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }
}
