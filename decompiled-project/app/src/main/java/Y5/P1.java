package Y5;

import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzhf;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.android.gms.internal.measurement.zzhp;
import com.google.android.gms.internal.measurement.zzhq;
import com.google.android.gms.internal.measurement.zzih;
import com.google.android.gms.internal.measurement.zzii;
import com.google.android.gms.internal.measurement.zzij;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzpq;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import u.C2049b;
import u.C2052e;

/* loaded from: classes.dex */
public final class P1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11526a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11527b;

    /* renamed from: c, reason: collision with root package name */
    public final zzii f11528c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f11529d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f11530e;

    /* renamed from: f, reason: collision with root package name */
    public final C2052e f11531f;
    public final C2052e g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0603c f11532h;

    /* JADX WARN: Type inference failed for: r1v4, types: [u.T, u.e] */
    /* JADX WARN: Type inference failed for: r1v5, types: [u.T, u.e] */
    public P1(C0603c c0603c, String str) {
        Objects.requireNonNull(c0603c);
        this.f11532h = c0603c;
        this.f11526a = str;
        this.f11527b = true;
        this.f11529d = new BitSet();
        this.f11530e = new BitSet();
        this.f11531f = new u.T(0);
        this.g = new u.T(0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [u.T, u.e] */
    public P1(C0603c c0603c, String str, zzii zziiVar, BitSet bitSet, BitSet bitSet2, C2052e c2052e, C2052e c2052e2) {
        Objects.requireNonNull(c0603c);
        this.f11532h = c0603c;
        this.f11526a = str;
        this.f11529d = bitSet;
        this.f11530e = bitSet2;
        this.f11531f = c2052e;
        this.g = new u.T(0);
        Iterator it = ((C2049b) c2052e2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) c2052e2.get(num));
            this.g.put(num, arrayList);
        }
        this.f11527b = false;
        this.f11528c = zziiVar;
    }

    public final void a(C0600b c0600b) {
        int zzb;
        boolean z8;
        boolean zzg;
        switch (c0600b.g) {
            case 0:
                zzb = ((zzff) c0600b.f11634i).zzb();
                break;
            default:
                zzb = ((zzfn) c0600b.f11634i).zzb();
                break;
        }
        if (c0600b.f11629c != null) {
            this.f11530e.set(zzb, true);
        }
        Boolean bool = c0600b.f11630d;
        if (bool != null) {
            this.f11529d.set(zzb, bool.booleanValue());
        }
        if (c0600b.f11631e != null) {
            Integer valueOf = Integer.valueOf(zzb);
            C2052e c2052e = this.f11531f;
            Long l10 = (Long) c2052e.get(valueOf);
            long longValue = c0600b.f11631e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                c2052e.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (c0600b.f11632f != null) {
            C2052e c2052e2 = this.g;
            Integer valueOf2 = Integer.valueOf(zzb);
            List list = (List) c2052e2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                c2052e2.put(valueOf2, list);
            }
            switch (c0600b.g) {
                case 0:
                    z8 = false;
                    break;
                default:
                    z8 = true;
                    break;
            }
            if (z8) {
                list.clear();
            }
            zzpq.zza();
            C0646q0 c0646q0 = (C0646q0) this.f11532h.f3094a;
            C0615g c0615g = c0646q0.f11910d;
            E e2 = F.f11264F0;
            String str = this.f11526a;
            if (c0615g.T(str, e2)) {
                switch (c0600b.g) {
                    case 0:
                        zzg = ((zzff) c0600b.f11634i).zzg();
                        break;
                    default:
                        zzg = false;
                        break;
                }
                if (zzg) {
                    list.clear();
                }
            }
            zzpq.zza();
            if (!c0646q0.f11910d.T(str, e2)) {
                list.add(Long.valueOf(c0600b.f11632f.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(c0600b.f11632f.longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }

    public final zzhg b(int i7) {
        ArrayList arrayList;
        List list;
        zzhf zzh = zzhg.zzh();
        zzh.zza(i7);
        zzh.zzd(this.f11527b);
        zzii zziiVar = this.f11528c;
        if (zziiVar != null) {
            zzh.zzc(zziiVar);
        }
        zzih zzi = zzii.zzi();
        zzi.zzc(C0598a0.r0(this.f11529d));
        zzi.zza(C0598a0.r0(this.f11530e));
        C2052e c2052e = this.f11531f;
        if (c2052e == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(c2052e.f24637c);
            Iterator it = ((C2049b) c2052e.keySet()).iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                Long l10 = (Long) c2052e.get(num);
                if (l10 != null) {
                    zzhp zze = zzhq.zze();
                    zze.zza(intValue);
                    zze.zzb(l10.longValue());
                    arrayList2.add((zzhq) zze.zzbc());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzi.zze(arrayList);
        }
        C2052e c2052e2 = this.g;
        if (c2052e2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(c2052e2.f24637c);
            Iterator it2 = ((C2049b) c2052e2.keySet()).iterator();
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                zzij zzf = zzik.zzf();
                zzf.zza(num2.intValue());
                List list2 = (List) c2052e2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    zzf.zzb(list2);
                }
                arrayList3.add((zzik) zzf.zzbc());
            }
            list = arrayList3;
        }
        zzi.zzg(list);
        zzh.zzb(zzi);
        return (zzhg) zzh.zzbc();
    }
}
