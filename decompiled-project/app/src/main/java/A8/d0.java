package A8;

import android.os.Message;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class d0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return q3.f.h(Long.valueOf(((Message) obj).getWhen()), Long.valueOf(((Message) obj2).getWhen()));
    }
}
