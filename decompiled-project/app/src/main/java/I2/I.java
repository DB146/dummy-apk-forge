package I2;

import A9.N2;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.internal.appindex.zzw;
import com.google.crypto.tink.shaded.protobuf.AbstractC1007a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1014h;
import com.google.firebase.appindexing.internal.Thing;
import h3.C1243e;
import h3.C1249k;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public Object f5048a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5049b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5050c;

    public I(E database) {
        kotlin.jvm.internal.l.e(database, "database");
        this.f5048a = database;
        this.f5049b = new AtomicBoolean(false);
        this.f5050c = android.support.v4.media.session.b.z(new N2(this, 9));
    }

    public I(Class cls) {
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.l.d(randomUUID, "randomUUID()");
        this.f5048a = randomUUID;
        String uuid = ((UUID) this.f5048a).toString();
        kotlin.jvm.internal.l.d(uuid, "id.toString()");
        this.f5049b = new q3.p(uuid, 0, cls.getName(), (String) null, (C1249k) null, (C1249k) null, 0L, 0L, 0L, (C1243e) null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, (String) null, 16777210);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(Eb.B.F(1));
        linkedHashSet.add(strArr[0]);
        this.f5050c = linkedHashSet;
    }

    public I(Class cls, U6.a... aVarArr) {
        this.f5048a = cls;
        HashMap hashMap = new HashMap();
        for (U6.a aVar : aVarArr) {
            aVar.getClass();
            if (hashMap.containsKey(S6.b.class)) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + S6.b.class.getCanonicalName());
            }
            hashMap.put(S6.b.class, aVar);
        }
        if (aVarArr.length > 0) {
            aVarArr[0].getClass();
            this.f5050c = S6.b.class;
        } else {
            this.f5050c = Void.class;
        }
        this.f5049b = Collections.unmodifiableMap(hashMap);
    }

    public I(String str) {
        com.google.android.gms.common.internal.G.d(str);
        this.f5048a = new Bundle();
        this.f5049b = str;
    }

    public V2.j a() {
        ((E) this.f5048a).a();
        return ((AtomicBoolean) this.f5049b).compareAndSet(false, true) ? (V2.j) ((Db.o) this.f5050c).getValue() : e();
    }

    public Thing b() {
        return new Thing(new Bundle((Bundle) this.f5048a), new m7.h(false, 0, "", new Bundle(), new Bundle()), (String) this.f5050c, (String) this.f5049b);
    }

    public h3.I c() {
        h3.I d10 = d();
        C1243e c1243e = ((q3.p) this.f5049b).j;
        boolean z8 = !c1243e.f17689i.isEmpty() || c1243e.f17686e || c1243e.f17684c || c1243e.f17685d;
        q3.p pVar = (q3.p) this.f5049b;
        if (pVar.f23416q) {
            if (z8) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (pVar.g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        if (pVar.f23423x == null) {
            List r02 = ac.g.r0(pVar.f23405c, new String[]{"."});
            String str = r02.size() == 1 ? (String) r02.get(0) : (String) Eb.o.e0(r02);
            if (str.length() > 127) {
                str = ac.g.u0(127, str);
            }
            pVar.f23423x = str;
        }
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.l.d(randomUUID, "randomUUID()");
        this.f5048a = randomUUID;
        String uuid = randomUUID.toString();
        kotlin.jvm.internal.l.d(uuid, "id.toString()");
        q3.p other = (q3.p) this.f5049b;
        kotlin.jvm.internal.l.e(other, "other");
        this.f5049b = new q3.p(uuid, other.f23404b, other.f23405c, other.f23406d, new C1249k(other.f23407e), new C1249k(other.f23408f), other.g, other.f23409h, other.f23410i, new C1243e(other.j), other.k, other.f23411l, other.f23412m, other.f23413n, other.f23414o, other.f23415p, other.f23416q, other.f23417r, other.f23418s, other.f23420u, other.f23421v, other.f23422w, other.f23423x, 524288);
        return d10;
    }

    public abstract h3.I d();

    public V2.j e() {
        String f4 = f();
        E e2 = (E) this.f5048a;
        e2.getClass();
        e2.a();
        e2.b();
        return e2.j().N().q(f4);
    }

    public abstract String f();

    public abstract String g();

    public abstract S6.a h();

    public abstract AbstractC1007a i(AbstractC1014h abstractC1014h);

    public void j(String str, I... iArr) {
        com.google.android.gms.common.internal.G.g(iArr);
        int length = iArr.length;
        if (length <= 0) {
            zzw.zza("Builder array is empty and is ignored by put method.");
            return;
        }
        Thing[] thingArr = new Thing[length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            I i10 = iArr[i7];
            if (i10 == null) {
                zzw.zza("Builder at " + i7 + " is null and is ignored by put method.");
            } else {
                thingArr[i7] = i10.b();
            }
        }
        if (length <= 0) {
            zzw.zza("Thing array is empty and is ignored by put method.");
            return;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            thingArr[i11] = thingArr[i12];
            if (thingArr[i12] == null) {
                zzw.zza("Thing at " + i12 + " is null and is ignored by put method.");
            } else {
                i11++;
            }
        }
        if (i11 > 0) {
            Object[] objArr = (Thing[]) Arrays.copyOf(thingArr, i11);
            if (objArr.length >= 100) {
                zzw.zza("Input Array of elements is too big, cutting off.");
                objArr = Arrays.copyOf(objArr, 100);
            }
            ((Bundle) this.f5048a).putParcelableArray(str, (Parcelable[]) objArr);
        }
    }

    public void k(String str, String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length <= 0) {
            zzw.zza("String array is empty and is ignored by put method.");
            return;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < Math.min(strArr2.length, 100); i10++) {
            String str2 = strArr2[i10];
            strArr2[i7] = str2;
            if (strArr2[i10] == null) {
                zzw.zza("String at " + i10 + " is null and is ignored by put method.");
            } else {
                int i11 = 20000;
                if (str2.length() > 20000) {
                    zzw.zza("String at " + i10 + " is too long, truncating string.");
                    String str3 = strArr2[i7];
                    if (str3.length() > 20000) {
                        if (Character.isHighSurrogate(str3.charAt(19999)) && Character.isLowSurrogate(str3.charAt(20000))) {
                            i11 = 19999;
                        }
                        str3 = str3.substring(0, i11);
                    }
                    strArr2[i7] = str3;
                }
                i7++;
            }
        }
        if (i7 > 0) {
            Object[] objArr = (String[]) Arrays.copyOf(strArr2, i7);
            if (objArr.length >= 100) {
                zzw.zza("Input Array of elements is too big, cutting off.");
                objArr = Arrays.copyOf(objArr, 100);
            }
            ((Bundle) this.f5048a).putStringArray(str, (String[]) objArr);
        }
    }

    public void l(V2.j statement) {
        kotlin.jvm.internal.l.e(statement, "statement");
        if (statement == ((V2.j) ((Db.o) this.f5050c).getValue())) {
            ((AtomicBoolean) this.f5049b).set(false);
        }
    }

    public abstract void m(AbstractC1007a abstractC1007a);
}
