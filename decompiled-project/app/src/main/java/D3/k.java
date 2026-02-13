package D3;

import W3.o;
import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f3193d;

    /* renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f3194e;

    /* renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f3195f;
    public static final Bitmap.Config[] g;

    /* renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f3196h;

    /* renamed from: a, reason: collision with root package name */
    public final e f3197a = new e(1);

    /* renamed from: b, reason: collision with root package name */
    public final q3.c f3198b = new q3.c(5, (byte) 0);

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3199c = new HashMap();

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            int length = configArr.length - 1;
            config = Bitmap.Config.RGBA_F16;
            configArr[length] = config;
        }
        f3193d = configArr;
        f3194e = configArr;
        f3195f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f3196h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i7, Bitmap.Config config) {
        return "[" + i7 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap d10 = d(bitmap.getConfig());
        Integer num2 = (Integer) d10.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d10.remove(num);
                return;
            } else {
                d10.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(o.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[EDGE_INSN: B:34:0x00a6->B:20:0x00a6 BREAK  A[LOOP:0: B:10:0x0058->B:32:0x00a3], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap b(int i7, int i10, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int length;
        int i11;
        Bitmap bitmap;
        Bitmap.Config config2;
        int d10 = o.d(config) * i7 * i10;
        e eVar = this.f3197a;
        h hVar = (h) ((ArrayDeque) eVar.f3094a).poll();
        if (hVar == null) {
            hVar = eVar.K();
        }
        j jVar = (j) hVar;
        jVar.f3191b = d10;
        jVar.f3192c = config;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config2.equals(config)) {
                configArr = f3194e;
                length = configArr.length;
                i11 = 0;
                while (true) {
                    if (i11 < length) {
                        break;
                    }
                    Bitmap.Config config3 = configArr[i11];
                    Integer num = (Integer) d(config3).ceilingKey(Integer.valueOf(d10));
                    if (num == null || num.intValue() > d10 * 8) {
                        i11++;
                    } else if (num.intValue() != d10 || (config3 != null ? !config3.equals(config) : config != null)) {
                        eVar.u(jVar);
                        int intValue = num.intValue();
                        h hVar2 = (h) ((ArrayDeque) eVar.f3094a).poll();
                        if (hVar2 == null) {
                            hVar2 = eVar.K();
                        }
                        jVar = (j) hVar2;
                        jVar.f3191b = intValue;
                        jVar.f3192c = config3;
                    }
                }
                bitmap = (Bitmap) this.f3198b.m(jVar);
                if (bitmap != null) {
                    a(Integer.valueOf(jVar.f3191b), bitmap);
                    bitmap.reconfigure(i7, i10, config);
                }
                return bitmap;
            }
        }
        int i12 = i.f3189a[config.ordinal()];
        configArr = i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? new Bitmap.Config[]{config} : f3196h : g : f3195f : f3193d;
        length = configArr.length;
        i11 = 0;
        while (true) {
            if (i11 < length) {
            }
            i11++;
        }
        bitmap = (Bitmap) this.f3198b.m(jVar);
        if (bitmap != null) {
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap hashMap = this.f3199c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int c10 = o.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        e eVar = this.f3197a;
        h hVar = (h) ((ArrayDeque) eVar.f3094a).poll();
        if (hVar == null) {
            hVar = eVar.K();
        }
        j jVar = (j) hVar;
        jVar.f3191b = c10;
        jVar.f3192c = config;
        this.f3198b.y(jVar, bitmap);
        NavigableMap d10 = d(bitmap.getConfig());
        Integer num = (Integer) d10.get(Integer.valueOf(jVar.f3191b));
        d10.put(Integer.valueOf(jVar.f3191b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder m10 = X.c.m("SizeConfigStrategy{groupedMap=");
        m10.append(this.f3198b);
        m10.append(", sortedSizes=(");
        HashMap hashMap = this.f3199c;
        for (Map.Entry entry : hashMap.entrySet()) {
            m10.append(entry.getKey());
            m10.append('[');
            m10.append(entry.getValue());
            m10.append("], ");
        }
        if (!hashMap.isEmpty()) {
            m10.replace(m10.length() - 2, m10.length(), "");
        }
        m10.append(")}");
        return m10.toString();
    }
}
