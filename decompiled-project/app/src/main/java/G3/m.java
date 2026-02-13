package G3;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class m implements j {

    /* renamed from: b, reason: collision with root package name */
    public final Map f4317b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Map f4318c;

    public m(Map map) {
        this.f4317b = Collections.unmodifiableMap(map);
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f4317b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                String str = ((l) list.get(i7)).f4316a;
                if (!TextUtils.isEmpty(str)) {
                    sb2.append(str);
                    if (i7 != list.size() - 1) {
                        sb2.append(',');
                    }
                }
            }
            String sb3 = sb2.toString();
            if (!TextUtils.isEmpty(sb3)) {
                hashMap.put((String) entry.getKey(), sb3);
            }
        }
        return hashMap;
    }

    public final Map b() {
        if (this.f4318c == null) {
            synchronized (this) {
                try {
                    if (this.f4318c == null) {
                        this.f4318c = Collections.unmodifiableMap(a());
                    }
                } finally {
                }
            }
        }
        return this.f4318c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f4317b.equals(((m) obj).f4317b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4317b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f4317b + '}';
    }
}
