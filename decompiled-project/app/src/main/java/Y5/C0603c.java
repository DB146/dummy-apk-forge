package Y5;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfm;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.android.gms.internal.measurement.zzhq;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzih;
import com.google.android.gms.internal.measurement.zzii;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zziu;
import com.google.android.gms.internal.measurement.zzpq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import u.C2049b;
import u.C2052e;

/* renamed from: Y5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0603c extends D1 {

    /* renamed from: d, reason: collision with root package name */
    public String f11678d;

    /* renamed from: e, reason: collision with root package name */
    public HashSet f11679e;

    /* renamed from: f, reason: collision with root package name */
    public C2052e f11680f;

    /* renamed from: u, reason: collision with root package name */
    public Long f11681u;

    /* renamed from: v, reason: collision with root package name */
    public Long f11682v;

    @Override // Y5.D1
    public final void M() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(2:2|(2:4|(2:6|7)(1:560))(2:561|562))|8|(3:10|11|12)|16|(1:559)(10:19|20|21|22|23|24|26|27|28|(15:30|(9:31|32|33|34|35|36|(1:38)(3:521|(2:523|524)(1:526)|525)|39|(1:42)(1:41))|43|44|45|46|47|48|(2:50|51)(3:477|(6:478|479|480|481|482|(1:485)(1:484))|486)|52|(1:54)(6:307|(12:309|310|311|312|313|(6:460|322|323|(3:418|(6:421|(2:455|456)(2:425|(8:427|428|(4:431|(2:433|434)(1:436)|435|429)|437|438|(4:441|(3:443|444|445)(1:447)|446|439)|448|449)(2:453|452))|450|451|452|419)|458)|325|326)|(4:315|(1:317)|318|319)|322|323|(0)|325|326)(1:476)|327|(10:330|(3:334|(4:337|(5:339|340|(1:342)(1:346)|343|344)(1:347)|345|335)|348)|349|(3:353|(4:356|(3:361|362|363)|364|354)|367)|368|(3:370|(6:373|(2:375|(3:377|378|379))(1:382)|380|381|379|371)|383)|384|(3:393|(8:396|(1:398)|399|(1:401)|402|(3:404|405|406)(1:408)|407|394)|409)|410|328)|416|417)|55|(3:194|(4:197|(3:199|200|(8:202|203|(10:205|206|207|208|209|210|211|212|(3:214|(11:215|216|217|218|219|220|221|(3:223|224|225)(1:278)|226|227|(1:230)(1:229))|231)(3:285|286|287)|232)(1:303)|233|(4:236|(3:258|259|260)(6:238|239|(2:240|(4:242|(1:244)(1:255)|245|(1:247)(2:248|249))(2:256|257))|(1:251)|252|253)|254|234)|261|262|263)(1:304))(1:305)|264|195)|306)|57|(7:59|(3:86|(6:89|(8:91|92|93|94|95|96|97|(3:(9:99|100|101|102|103|(1:105)(1:166)|106|107|(1:110)(1:109))|111|112)(4:173|174|165|112))(1:190)|113|(2:114|(2:116|(3:156|157|158)(8:118|(2:119|(4:121|(3:123|(1:125)(1:152)|126)(1:153)|127|(1:1)(4:131|(1:133)(1:144)|134|(1:136)(2:137|138)))(2:154|155))|146|(1:148)(1:150)|149|140|141|142))(0))|159|87)|191)|61|62|(9:65|66|67|68|69|70|(2:72|73)(1:75)|74|63)|83|84)(2:192|193))(3:538|539|537))|536|44|45|46|47|48|(0)(0)|52|(0)(0)|55|(0)|57|(0)(0)|(4:(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x09fd, code lost:
    
        if (r8 != false) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x08e1, code lost:
    
        if (r11 == null) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0327, code lost:
    
        if (r5 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x01e8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x01e9, code lost:
    
        r19 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x01eb, code lost:
    
        r20 = "Database error querying filters. appId";
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0256, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0257, code lost:
    
        r19 = "audience_id";
        r20 = "Database error querying filters. appId";
        r21 = "Failed to merge filter. appId";
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0261, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0254, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x025e, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0192, code lost:
    
        if (r4 == null) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0aad  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x01f1 A[Catch: all -> 0x01e5, SQLiteException -> 0x01e8, TRY_ENTER, TryCatch #5 {all -> 0x01e5, blocks: (B:48:0x01cf, B:50:0x01d5, B:477:0x01f1, B:478:0x01f6, B:480:0x0200, B:481:0x0210, B:482:0x023a, B:495:0x021f, B:500:0x022d, B:503:0x0233, B:489:0x0262), top: B:45:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d5 A[Catch: all -> 0x01e5, SQLiteException -> 0x01e8, TRY_LEAVE, TryCatch #5 {all -> 0x01e5, blocks: (B:48:0x01cf, B:50:0x01d5, B:477:0x01f1, B:478:0x01f6, B:480:0x0200, B:481:0x0210, B:482:0x023a, B:495:0x021f, B:500:0x022d, B:503:0x0233, B:489:0x0262), top: B:45:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0ab5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x07ea  */
    /* JADX WARN: Type inference failed for: r0v35, types: [u.T, u.e] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v45, types: [u.T, u.e] */
    /* JADX WARN: Type inference failed for: r16v9, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r18v12, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v76, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v79, types: [Y5.U] */
    /* JADX WARN: Type inference failed for: r8v51, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList N(String str, List list, List list2, Long l10, Long l11, boolean z8) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Object obj;
        Map map;
        boolean z12;
        String str4;
        Object obj2;
        String str5;
        String str6;
        String str7;
        Cursor cursor;
        Map map2;
        I1 i12;
        Map map3;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        I1 i13;
        C0646q0 c0646q0;
        String str13;
        List<zzff> list3;
        Iterator it;
        ?? r22;
        Cursor cursor2;
        Map map4;
        Map map5;
        Iterator it2;
        I1 i14;
        X x2;
        Iterator it3;
        String str14;
        String str15;
        Iterator it4;
        Map map6;
        Iterator it5;
        C2052e c2052e;
        boolean z13;
        Cursor cursor3;
        List list4;
        Iterator it6;
        String str16;
        Map map7;
        zzfn zzfnVar;
        Cursor cursor4;
        Cursor cursor5;
        List list5;
        ?? r23;
        String str17;
        boolean z14;
        Cursor cursor6;
        boolean z15;
        String str18;
        Object obj3;
        String str19;
        boolean z16;
        Object obj4;
        boolean z17;
        List list6;
        String str20 = "current_results";
        com.google.android.gms.common.internal.G.d(str);
        com.google.android.gms.common.internal.G.g(list);
        com.google.android.gms.common.internal.G.g(list2);
        this.f11678d = str;
        this.f11679e = new HashSet();
        this.f11680f = new C2052e();
        this.f11681u = l10;
        this.f11682v = l11;
        Iterator it7 = list.iterator();
        while (true) {
            if (!it7.hasNext()) {
                z10 = false;
                break;
            }
            if ("_s".equals(((zzhs) it7.next()).zzd())) {
                z10 = true;
                break;
            }
        }
        zzpq.zza();
        C0646q0 c0646q02 = (C0646q0) this.f3094a;
        boolean T10 = c0646q02.f11910d.T(this.f11678d, F.f11264F0);
        zzpq.zza();
        boolean T11 = c0646q02.f11910d.T(this.f11678d, F.f11262E0);
        I1 i15 = this.f12021b;
        if (z10) {
            C0633m f02 = i15.f0();
            String str21 = this.f11678d;
            f02.K();
            f02.J();
            com.google.android.gms.common.internal.G.d(str21);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                f02.A0().update("events", contentValues, "app_id = ?", new String[]{str21});
            } catch (SQLiteException e2) {
                ((C0646q0) f02.f3094a).b().N().c("Error resetting session-scoped event counts. appId", W.R(str21), e2);
            }
        }
        Map emptyMap = Collections.emptyMap();
        String str22 = "Failed to merge filter. appId";
        String str23 = "Database error querying filters. appId";
        String str24 = "audience_id";
        try {
            if (T11 && T10) {
                C0633m f03 = i15.f0();
                C0646q0 c0646q03 = (C0646q0) f03.f3094a;
                String str25 = this.f11678d;
                com.google.android.gms.common.internal.G.d(str25);
                ?? c2052e2 = new C2052e();
                ?? A02 = f03.A0();
                try {
                    try {
                        try {
                            ?? r18 = {"audience_id", "data"};
                            str2 = "data";
                            try {
                                cursor6 = A02.query("event_filters", r18, "app_id=?", new String[]{str25}, null, null, null);
                                try {
                                    try {
                                    } catch (SQLiteException e10) {
                                        e = e10;
                                        str17 = A02;
                                        z14 = r18;
                                        ?? N10 = c0646q03.b().N();
                                        Object R10 = W.R(str25);
                                        N10.c("Database error querying filters. appId", R10, e);
                                        emptyMap = Collections.emptyMap();
                                        obj = R10;
                                        str3 = str17;
                                        z11 = z14;
                                        obj3 = R10;
                                        str18 = str17;
                                        z15 = z14;
                                    }
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    str19 = "events";
                                }
                            } catch (SQLiteException e12) {
                                e = e12;
                                str17 = "events";
                                z14 = T10;
                                cursor6 = null;
                                ?? N102 = c0646q03.b().N();
                                Object R102 = W.R(str25);
                                N102.c("Database error querying filters. appId", R102, e);
                                emptyMap = Collections.emptyMap();
                                obj = R102;
                                str3 = str17;
                                z11 = z14;
                                obj3 = R102;
                                str18 = str17;
                                z15 = z14;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r23 = "data";
                            if (r23 != 0) {
                                r23.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r23 = 0;
                        if (r23 != 0) {
                        }
                        throw th;
                    }
                } catch (SQLiteException e13) {
                    e = e13;
                    str2 = "data";
                }
                if (cursor6.moveToFirst()) {
                    str19 = "events";
                    while (true) {
                        try {
                            try {
                                zzff zzffVar = (zzff) ((zzfe) C0598a0.w0(zzff.zzn(), cursor6.getBlob(1))).zzbc();
                                ?? zzg = zzffVar.zzg();
                                if (zzg == 0) {
                                    z16 = T10;
                                    obj4 = zzg;
                                } else {
                                    Object valueOf = Integer.valueOf(cursor6.getInt(0));
                                    List list7 = (List) c2052e2.get(valueOf);
                                    if (list7 == null) {
                                        z17 = T10;
                                        list6 = new ArrayList();
                                        c2052e2.put(valueOf, list6);
                                    } else {
                                        z17 = T10;
                                        list6 = list7;
                                    }
                                    list6.add(zzffVar);
                                    obj4 = valueOf;
                                    z16 = z17;
                                }
                            } catch (IOException e14) {
                                z16 = T10;
                                U N11 = c0646q03.b().N();
                                N11.c("Failed to merge filter. appId", W.R(str25), e14);
                                obj4 = N11;
                            }
                            if (!cursor6.moveToNext()) {
                                break;
                            }
                            T10 = z16;
                        } catch (SQLiteException e15) {
                            e = e15;
                            z14 = T10;
                            str17 = str19;
                            ?? N1022 = c0646q03.b().N();
                            Object R1022 = W.R(str25);
                            N1022.c("Database error querying filters. appId", R1022, e);
                            emptyMap = Collections.emptyMap();
                            obj = R1022;
                            str3 = str17;
                            z11 = z14;
                            obj3 = R1022;
                            str18 = str17;
                            z15 = z14;
                        }
                    }
                    cursor6.close();
                    obj2 = obj4;
                    map = c2052e2;
                    str4 = str19;
                    z12 = z16;
                    C0633m f04 = i15.f0();
                    C0646q0 c0646q04 = (C0646q0) f04.f3094a;
                    String str26 = this.f11678d;
                    f04.K();
                    f04.J();
                    com.google.android.gms.common.internal.G.d(str26);
                    cursor = f04.A0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str26}, null, null, null);
                    if (cursor.moveToFirst()) {
                        Map emptyMap2 = Collections.emptyMap();
                        cursor.close();
                        map2 = emptyMap2;
                        str5 = "audience_id";
                        str6 = "Database error querying filters. appId";
                        str7 = "Failed to merge filter. appId";
                    } else {
                        C2052e c2052e3 = new C2052e();
                        while (true) {
                            int i7 = cursor.getInt(0);
                            try {
                                c2052e3.put(Integer.valueOf(i7), (zzii) ((zzih) C0598a0.w0(zzii.zzi(), cursor.getBlob(1))).zzbc());
                                str5 = str24;
                                str6 = str23;
                                str7 = str22;
                            } catch (IOException e16) {
                                str5 = str24;
                                str6 = str23;
                                try {
                                    str7 = str22;
                                    try {
                                        c0646q04.b().N().d("Failed to merge filter results. appId, audienceId, error", W.R(str26), Integer.valueOf(i7), e16);
                                    } catch (SQLiteException e17) {
                                        e = e17;
                                        c0646q04.b().N().c("Database error querying filter results. appId", W.R(str26), e);
                                        Map emptyMap3 = Collections.emptyMap();
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        map2 = emptyMap3;
                                        if (map2.isEmpty()) {
                                        }
                                        if (!list.isEmpty()) {
                                        }
                                        String str27 = str8;
                                        if (!z8) {
                                        }
                                    }
                                } catch (SQLiteException e18) {
                                    e = e18;
                                    str7 = str22;
                                    c0646q04.b().N().c("Database error querying filter results. appId", W.R(str26), e);
                                    Map emptyMap32 = Collections.emptyMap();
                                    if (cursor != null) {
                                    }
                                    map2 = emptyMap32;
                                    if (map2.isEmpty()) {
                                    }
                                    if (!list.isEmpty()) {
                                    }
                                    String str272 = str8;
                                    if (!z8) {
                                    }
                                }
                            }
                            if (!cursor.moveToNext()) {
                                break;
                            }
                            str24 = str5;
                            str23 = str6;
                            str22 = str7;
                        }
                        cursor.close();
                        map2 = c2052e3;
                    }
                    if (map2.isEmpty()) {
                        HashSet hashSet = new HashSet(map2.keySet());
                        if (z10) {
                            String str28 = this.f11678d;
                            C0633m f05 = i15.f0();
                            String str29 = this.f11678d;
                            f05.K();
                            f05.J();
                            com.google.android.gms.common.internal.G.d(str29);
                            ?? c2052e4 = new C2052e();
                            SQLiteDatabase A03 = f05.A0();
                            try {
                                try {
                                    cursor2 = A03.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str29, str29});
                                    try {
                                    } catch (SQLiteException e19) {
                                        e = e19;
                                        ((C0646q0) f05.f3094a).b().N().c("Database error querying scoped filters. appId", W.R(str29), e);
                                        c2052e4 = Collections.emptyMap();
                                        map4 = c2052e4;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    r22 = A03;
                                    if (r22 != 0) {
                                        r22.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e20) {
                                e = e20;
                                cursor2 = null;
                            } catch (Throwable th4) {
                                th = th4;
                                r22 = 0;
                                if (r22 != 0) {
                                }
                                throw th;
                            }
                            if (!cursor2.moveToFirst()) {
                                c2052e4 = Collections.emptyMap();
                                cursor2.close();
                                map4 = c2052e4;
                                com.google.android.gms.common.internal.G.d(str28);
                                C2052e c2052e5 = new C2052e();
                                if (!map2.isEmpty()) {
                                    Iterator it8 = map2.keySet().iterator();
                                    while (it8.hasNext()) {
                                        Integer num = (Integer) it8.next();
                                        num.getClass();
                                        zzii zziiVar = (zzii) map2.get(num);
                                        List list8 = (List) map4.get(num);
                                        if (list8 == null || list8.isEmpty()) {
                                            map5 = map4;
                                            it2 = it8;
                                            i14 = i15;
                                            c2052e5.put(num, zziiVar);
                                        } else {
                                            List s02 = i15.i0().s0(zziiVar.zzc(), list8);
                                            if (!s02.isEmpty()) {
                                                zzih zzihVar = (zzih) zziiVar.zzcl();
                                                zzihVar.zzd();
                                                zzihVar.zzc(s02);
                                                map5 = map4;
                                                List s03 = i15.i0().s0(zziiVar.zza(), list8);
                                                zzihVar.zzb();
                                                zzihVar.zza(s03);
                                                ArrayList arrayList = new ArrayList();
                                                for (zzhq zzhqVar : zziiVar.zze()) {
                                                    Iterator it9 = it8;
                                                    I1 i16 = i15;
                                                    if (!list8.contains(Integer.valueOf(zzhqVar.zzb()))) {
                                                        arrayList.add(zzhqVar);
                                                    }
                                                    it8 = it9;
                                                    i15 = i16;
                                                }
                                                it2 = it8;
                                                i14 = i15;
                                                zzihVar.zzf();
                                                zzihVar.zze(arrayList);
                                                ArrayList arrayList2 = new ArrayList();
                                                for (zzik zzikVar : zziiVar.zzg()) {
                                                    if (!list8.contains(Integer.valueOf(zzikVar.zzb()))) {
                                                        arrayList2.add(zzikVar);
                                                    }
                                                }
                                                zzihVar.zzh();
                                                zzihVar.zzg(arrayList2);
                                                c2052e5.put(num, (zzii) zzihVar.zzbc());
                                            }
                                        }
                                        map4 = map5;
                                        it8 = it2;
                                        i15 = i14;
                                    }
                                }
                                i12 = i15;
                                map3 = c2052e5;
                            }
                            do {
                                Integer valueOf2 = Integer.valueOf(cursor2.getInt(0));
                                List list9 = (List) c2052e4.get(valueOf2);
                                if (list9 == null) {
                                    list9 = new ArrayList();
                                    c2052e4.put(valueOf2, list9);
                                }
                                list9.add(Integer.valueOf(cursor2.getInt(1)));
                            } while (cursor2.moveToNext());
                            cursor2.close();
                            map4 = c2052e4;
                            com.google.android.gms.common.internal.G.d(str28);
                            C2052e c2052e52 = new C2052e();
                            if (!map2.isEmpty()) {
                            }
                            i12 = i15;
                            map3 = c2052e52;
                        } else {
                            i12 = i15;
                            map3 = map2;
                        }
                        Iterator it10 = hashSet.iterator();
                        Map map8 = map;
                        Map map9 = map2;
                        while (it10.hasNext()) {
                            Integer num2 = (Integer) it10.next();
                            num2.getClass();
                            zzii zziiVar2 = (zzii) map3.get(num2);
                            BitSet bitSet = new BitSet();
                            BitSet bitSet2 = new BitSet();
                            C2052e c2052e6 = new C2052e();
                            if (zziiVar2 != null && zziiVar2.zzf() != 0) {
                                for (zzhq zzhqVar2 : zziiVar2.zze()) {
                                    if (zzhqVar2.zza()) {
                                        c2052e6.put(Integer.valueOf(zzhqVar2.zzb()), zzhqVar2.zzc() ? Long.valueOf(zzhqVar2.zzd()) : null);
                                    }
                                }
                            }
                            C2052e c2052e7 = new C2052e();
                            if (zziiVar2 != null && zziiVar2.zzh() != 0) {
                                Iterator it11 = zziiVar2.zzg().iterator();
                                while (it11.hasNext()) {
                                    zzik zzikVar2 = (zzik) it11.next();
                                    if (zzikVar2.zza() && zzikVar2.zzd() > 0) {
                                        c2052e7.put(Integer.valueOf(zzikVar2.zzb()), Long.valueOf(zzikVar2.zze(zzikVar2.zzd() - 1)));
                                        map3 = map3;
                                        it11 = it11;
                                    }
                                }
                            }
                            Map map10 = map3;
                            if (zziiVar2 != null) {
                                int i10 = 0;
                                while (i10 < zziiVar2.zzb() * 64) {
                                    if (C0598a0.q0(i10, zziiVar2.zza())) {
                                        it = it10;
                                        c0646q02.b().Q().c("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i10));
                                        bitSet2.set(i10);
                                        if (C0598a0.q0(i10, zziiVar2.zzc())) {
                                            bitSet.set(i10);
                                            i10++;
                                            it10 = it;
                                        }
                                    } else {
                                        it = it10;
                                    }
                                    c2052e6.remove(Integer.valueOf(i10));
                                    i10++;
                                    it10 = it;
                                }
                            }
                            Iterator it12 = it10;
                            zzii zziiVar3 = (zzii) map9.get(num2);
                            if (T11 && z12 && (list3 = (List) map8.get(num2)) != null && this.f11682v != null && this.f11681u != null) {
                                for (zzff zzffVar2 : list3) {
                                    int zzb = zzffVar2.zzb();
                                    long longValue = this.f11682v.longValue() / 1000;
                                    if (zzffVar2.zzj()) {
                                        longValue = this.f11681u.longValue() / 1000;
                                    }
                                    Integer valueOf3 = Integer.valueOf(zzb);
                                    if (c2052e6.containsKey(valueOf3)) {
                                        c2052e6.put(valueOf3, Long.valueOf(longValue));
                                    }
                                    if (c2052e7.containsKey(valueOf3)) {
                                        c2052e7.put(valueOf3, Long.valueOf(longValue));
                                    }
                                }
                            }
                            boolean z18 = T11;
                            this.f11680f.put(num2, new P1(this, this.f11678d, zziiVar3, bitSet, bitSet2, c2052e6, c2052e7));
                            str2 = str2;
                            it10 = it12;
                            map9 = map9;
                            map3 = map10;
                            c0646q02 = c0646q02;
                            str5 = str5;
                            i12 = i12;
                            map8 = map8;
                            str7 = str7;
                            str20 = str20;
                            str6 = str6;
                            T11 = z18;
                        }
                        str8 = str5;
                        str9 = str6;
                        str10 = str2;
                        str11 = str20;
                        str12 = str7;
                        i13 = i12;
                        c0646q0 = c0646q02;
                        str13 = str4;
                    } else {
                        c0646q0 = c0646q02;
                        str13 = str4;
                        str8 = str5;
                        str9 = str6;
                        str10 = str2;
                        str11 = "current_results";
                        str12 = str7;
                        i13 = i15;
                    }
                    if (!list.isEmpty()) {
                        X x10 = new X(this);
                        C2052e c2052e8 = new C2052e();
                        Iterator it13 = list.iterator();
                        while (it13.hasNext()) {
                            zzhs zzhsVar = (zzhs) it13.next();
                            zzhs b2 = x10.b(zzhsVar, this.f11678d);
                            if (b2 != null) {
                                C0645q t02 = i13.f0().t0(this.f11678d, zzhsVar, b2.zzd());
                                i13.f0().k0(str13, t02);
                                if (z8) {
                                    continue;
                                } else {
                                    String zzd = b2.zzd();
                                    Map map11 = (Map) c2052e8.get(zzd);
                                    if (map11 == null) {
                                        C0633m f06 = i13.f0();
                                        C0646q0 c0646q05 = (C0646q0) f06.f3094a;
                                        String str30 = this.f11678d;
                                        f06.K();
                                        f06.J();
                                        com.google.android.gms.common.internal.G.d(str30);
                                        com.google.android.gms.common.internal.G.d(zzd);
                                        x2 = x10;
                                        C2052e c2052e9 = new C2052e();
                                        try {
                                            try {
                                                it3 = it13;
                                                try {
                                                    Cursor query = f06.A0().query("event_filters", new String[]{str8, str10}, "app_id=? AND event_name=?", new String[]{str30, zzd}, null, null, null);
                                                    try {
                                                        try {
                                                            if (query.moveToFirst()) {
                                                                str15 = str13;
                                                                while (true) {
                                                                    try {
                                                                        try {
                                                                            zzff zzffVar3 = (zzff) ((zzfe) C0598a0.w0(zzff.zzn(), query.getBlob(1))).zzbc();
                                                                            Integer valueOf4 = Integer.valueOf(query.getInt(0));
                                                                            List list10 = (List) c2052e9.get(valueOf4);
                                                                            if (list10 == null) {
                                                                                str14 = str8;
                                                                                try {
                                                                                    list4 = new ArrayList();
                                                                                    c2052e9.put(valueOf4, list4);
                                                                                } catch (SQLiteException e21) {
                                                                                    e = e21;
                                                                                    cursor3 = query;
                                                                                    try {
                                                                                        c0646q05.b().N().c(str9, W.R(str30), e);
                                                                                        map11 = Collections.emptyMap();
                                                                                        if (cursor3 != null) {
                                                                                        }
                                                                                        c2052e8.put(zzd, map11);
                                                                                        it4 = map11.keySet().iterator();
                                                                                        while (it4.hasNext()) {
                                                                                        }
                                                                                        it13 = it3;
                                                                                        x10 = x2;
                                                                                        str13 = str15;
                                                                                        str8 = str14;
                                                                                    } catch (Throwable th5) {
                                                                                        th = th5;
                                                                                        if (cursor3 != null) {
                                                                                            cursor3.close();
                                                                                        }
                                                                                        throw th;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                str14 = str8;
                                                                                list4 = list10;
                                                                            }
                                                                            list4.add(zzffVar3);
                                                                        } catch (IOException e22) {
                                                                            str14 = str8;
                                                                            c0646q05.b().N().c(str12, W.R(str30), e22);
                                                                        }
                                                                        if (!query.moveToNext()) {
                                                                            break;
                                                                        }
                                                                        str8 = str14;
                                                                    } catch (SQLiteException e23) {
                                                                        e = e23;
                                                                        str14 = str8;
                                                                    }
                                                                }
                                                                query.close();
                                                                map11 = c2052e9;
                                                            } else {
                                                                str14 = str8;
                                                                str15 = str13;
                                                                map11 = Collections.emptyMap();
                                                                query.close();
                                                            }
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            cursor3 = query;
                                                            if (cursor3 != null) {
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (SQLiteException e24) {
                                                        e = e24;
                                                        str14 = str8;
                                                        str15 = str13;
                                                    }
                                                } catch (SQLiteException e25) {
                                                    e = e25;
                                                    str14 = str8;
                                                    str15 = str13;
                                                    cursor3 = null;
                                                    c0646q05.b().N().c(str9, W.R(str30), e);
                                                    map11 = Collections.emptyMap();
                                                    if (cursor3 != null) {
                                                        cursor3.close();
                                                    }
                                                    c2052e8.put(zzd, map11);
                                                    it4 = map11.keySet().iterator();
                                                    while (it4.hasNext()) {
                                                    }
                                                    it13 = it3;
                                                    x10 = x2;
                                                    str13 = str15;
                                                    str8 = str14;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                cursor3 = null;
                                            }
                                        } catch (SQLiteException e26) {
                                            e = e26;
                                            it3 = it13;
                                        }
                                        c2052e8.put(zzd, map11);
                                    } else {
                                        x2 = x10;
                                        it3 = it13;
                                        str14 = str8;
                                        str15 = str13;
                                    }
                                    it4 = map11.keySet().iterator();
                                    while (it4.hasNext()) {
                                        Integer num3 = (Integer) it4.next();
                                        int intValue = num3.intValue();
                                        if (this.f11679e.contains(num3)) {
                                            c0646q0.b().Q().b(num3, "Skipping failed audience ID");
                                        } else {
                                            Iterator it14 = ((List) map11.get(num3)).iterator();
                                            boolean z19 = true;
                                            while (true) {
                                                if (!it14.hasNext()) {
                                                    map6 = map11;
                                                    it5 = it4;
                                                    c2052e = c2052e8;
                                                    break;
                                                }
                                                zzff zzffVar4 = (zzff) it14.next();
                                                C0600b c0600b = new C0600b(this, this.f11678d, intValue, zzffVar4);
                                                Long l12 = this.f11681u;
                                                map6 = map11;
                                                Long l13 = this.f11682v;
                                                int zzb2 = zzffVar4.zzb();
                                                it5 = it4;
                                                P1 p1 = (P1) this.f11680f.get(num3);
                                                if (p1 == null) {
                                                    c2052e = c2052e8;
                                                    z13 = false;
                                                } else {
                                                    z13 = p1.f11529d.get(zzb2);
                                                    c2052e = c2052e8;
                                                }
                                                z19 = c0600b.a(l12, l13, b2, t02.f11883c, t02, z13);
                                                if (!z19) {
                                                    this.f11679e.add(num3);
                                                    break;
                                                }
                                                O(num3).a(c0600b);
                                                map11 = map6;
                                                it4 = it5;
                                                c2052e8 = c2052e;
                                            }
                                            if (!z19) {
                                                this.f11679e.add(num3);
                                            }
                                            map11 = map6;
                                            it4 = it5;
                                            c2052e8 = c2052e;
                                        }
                                    }
                                    it13 = it3;
                                    x10 = x2;
                                    str13 = str15;
                                    str8 = str14;
                                }
                            }
                        }
                    }
                    String str2722 = str8;
                    if (!z8) {
                        return new ArrayList();
                    }
                    if (!list2.isEmpty()) {
                        C2052e c2052e10 = new C2052e();
                        Iterator it15 = list2.iterator();
                        while (it15.hasNext()) {
                            zziu zziuVar = (zziu) it15.next();
                            String zzc = zziuVar.zzc();
                            Map map12 = (Map) c2052e10.get(zzc);
                            if (map12 == null) {
                                C0633m f07 = i13.f0();
                                C0646q0 c0646q06 = (C0646q0) f07.f3094a;
                                String str31 = this.f11678d;
                                f07.K();
                                f07.J();
                                com.google.android.gms.common.internal.G.d(str31);
                                com.google.android.gms.common.internal.G.d(zzc);
                                C2052e c2052e11 = new C2052e();
                                str16 = str2722;
                                try {
                                    cursor5 = f07.A0().query("property_filters", new String[]{str16, str10}, "app_id=? AND property_name=?", new String[]{str31, zzc}, null, null, null);
                                    try {
                                        try {
                                        } catch (Throwable th8) {
                                            th = th8;
                                            cursor4 = cursor5;
                                            if (cursor4 != null) {
                                                cursor4.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e27) {
                                        e = e27;
                                        it6 = it15;
                                    }
                                } catch (SQLiteException e28) {
                                    e = e28;
                                    it6 = it15;
                                    cursor5 = null;
                                } catch (Throwable th9) {
                                    th = th9;
                                    cursor4 = null;
                                }
                                if (cursor5.moveToFirst()) {
                                    while (true) {
                                        try {
                                            zzfn zzfnVar2 = (zzfn) ((zzfm) C0598a0.w0(zzfn.zzi(), cursor5.getBlob(1))).zzbc();
                                            Integer valueOf5 = Integer.valueOf(cursor5.getInt(0));
                                            List list11 = (List) c2052e11.get(valueOf5);
                                            if (list11 == null) {
                                                list5 = new ArrayList();
                                                c2052e11.put(valueOf5, list5);
                                            } else {
                                                list5 = list11;
                                            }
                                            list5.add(zzfnVar2);
                                            it6 = it15;
                                        } catch (IOException e29) {
                                            it6 = it15;
                                            try {
                                                c0646q06.b().N().c("Failed to merge filter", W.R(str31), e29);
                                            } catch (SQLiteException e30) {
                                                e = e30;
                                                c0646q06.b().N().c(str9, W.R(str31), e);
                                                map12 = Collections.emptyMap();
                                            }
                                        }
                                        if (!cursor5.moveToNext()) {
                                            break;
                                        }
                                        it15 = it6;
                                    }
                                    cursor5.close();
                                    map12 = c2052e11;
                                    c2052e10.put(zzc, map12);
                                } else {
                                    it6 = it15;
                                    map12 = Collections.emptyMap();
                                    cursor5.close();
                                    c2052e10.put(zzc, map12);
                                }
                            } else {
                                it6 = it15;
                                str16 = str2722;
                            }
                            Iterator it16 = map12.keySet().iterator();
                            while (true) {
                                if (it16.hasNext()) {
                                    Integer num4 = (Integer) it16.next();
                                    int intValue2 = num4.intValue();
                                    if (this.f11679e.contains(num4)) {
                                        c0646q0.b().Q().b(num4, "Skipping failed audience ID");
                                        break;
                                    }
                                    Iterator it17 = ((List) map12.get(num4)).iterator();
                                    boolean z20 = true;
                                    while (true) {
                                        if (!it17.hasNext()) {
                                            map7 = map12;
                                            break;
                                        }
                                        zzfnVar = (zzfn) it17.next();
                                        if (Log.isLoggable(c0646q0.b().T(), 2)) {
                                            map7 = map12;
                                            c0646q0.b().Q().d("Evaluating filter. audience, filter, property", num4, zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null, c0646q0.m().c(zzfnVar.zzc()));
                                            c0646q0.b().Q().b(i13.i0().n0(zzfnVar), "Filter definition");
                                        } else {
                                            map7 = map12;
                                        }
                                        if (!zzfnVar.zza() || zzfnVar.zzb() > 256) {
                                            break;
                                        }
                                        C0600b c0600b2 = new C0600b(this, this.f11678d, intValue2, zzfnVar);
                                        Long l14 = this.f11681u;
                                        Long l15 = this.f11682v;
                                        int zzb3 = zzfnVar.zzb();
                                        P1 p12 = (P1) this.f11680f.get(num4);
                                        z20 = c0600b2.b(l14, l15, zziuVar, p12 == null ? false : p12.f11529d.get(zzb3));
                                        if (!z20) {
                                            this.f11679e.add(num4);
                                            break;
                                        }
                                        O(num4).a(c0600b2);
                                        map12 = map7;
                                    }
                                    c0646q0.b().O().c("Invalid property filter ID. appId, id", W.R(this.f11678d), String.valueOf(zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null));
                                    this.f11679e.add(num4);
                                    map12 = map7;
                                }
                            }
                            it15 = it6;
                            str2722 = str16;
                        }
                    }
                    String str32 = str2722;
                    ArrayList arrayList3 = new ArrayList();
                    C2049b c2049b = (C2049b) this.f11680f.keySet();
                    c2049b.removeAll(this.f11679e);
                    Iterator it18 = c2049b.iterator();
                    while (it18.hasNext()) {
                        Integer num5 = (Integer) it18.next();
                        int intValue3 = num5.intValue();
                        P1 p13 = (P1) this.f11680f.get(num5);
                        com.google.android.gms.common.internal.G.g(p13);
                        zzhg b10 = p13.b(intValue3);
                        arrayList3.add(b10);
                        C0633m f08 = i13.f0();
                        C0646q0 c0646q07 = (C0646q0) f08.f3094a;
                        String str33 = this.f11678d;
                        zzii zzc2 = b10.zzc();
                        f08.K();
                        f08.J();
                        com.google.android.gms.common.internal.G.d(str33);
                        com.google.android.gms.common.internal.G.g(zzc2);
                        byte[] zzcc = zzc2.zzcc();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("app_id", str33);
                        contentValues2.put(str32, num5);
                        String str34 = str11;
                        contentValues2.put(str34, zzcc);
                        try {
                        } catch (SQLiteException e31) {
                            e = e31;
                        }
                        try {
                            if (f08.A0().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                                c0646q07.b().N().b(W.R(str33), "Failed to insert filter results (got -1). appId");
                            }
                        } catch (SQLiteException e32) {
                            e = e32;
                            c0646q07.b().N().c("Error storing filter results. appId", W.R(str33), e);
                            str11 = str34;
                        }
                        str11 = str34;
                    }
                    return arrayList3;
                }
                str18 = "events";
                z15 = T10;
                emptyMap = Collections.emptyMap();
                obj3 = "events";
                cursor6.close();
                obj = obj3;
                str3 = str18;
                z11 = z15;
            } else {
                str2 = "data";
                str3 = "events";
                z11 = T10;
                obj = "events";
            }
            cursor = f04.A0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str26}, null, null, null);
            if (cursor.moveToFirst()) {
            }
            if (map2.isEmpty()) {
            }
            if (!list.isEmpty()) {
            }
            String str27222 = str8;
            if (!z8) {
            }
        } catch (Throwable th10) {
            th = th10;
            ?? r24 = obj2;
            if (r24 != null) {
                r24.close();
            }
            throw th;
        }
        map = emptyMap;
        obj2 = obj;
        str4 = str3;
        z12 = z11;
        C0633m f042 = i15.f0();
        C0646q0 c0646q042 = (C0646q0) f042.f3094a;
        String str262 = this.f11678d;
        f042.K();
        f042.J();
        com.google.android.gms.common.internal.G.d(str262);
    }

    public final P1 O(Integer num) {
        if (this.f11680f.containsKey(num)) {
            return (P1) this.f11680f.get(num);
        }
        P1 p1 = new P1(this, this.f11678d);
        this.f11680f.put(num, p1);
        return p1;
    }
}
