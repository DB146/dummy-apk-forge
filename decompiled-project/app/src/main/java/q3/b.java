package q3;

import I2.E;
import I2.I;
import android.net.NetworkRequest;
import android.os.Build;
import h3.C1242d;
import h3.C1243e;
import h3.C1249k;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Set;
import r3.C1921e;

/* loaded from: classes.dex */
public final class b extends I {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23369d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(E e2, int i7) {
        super(e2);
        this.f23369d = i7;
    }

    @Override // I2.I
    public final String f() {
        switch (this.f23369d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public final void n(V2.j jVar, Object obj) {
        int i7;
        int i10;
        int[] r02;
        boolean hasTransport;
        int[] r03;
        boolean hasCapability;
        byte[] byteArray;
        byte[] byteArray2;
        int i11 = 5;
        switch (this.f23369d) {
            case 0:
                a aVar = (a) obj;
                jVar.p(1, aVar.f23367a);
                jVar.p(2, aVar.f23368b);
                return;
            case 1:
                d dVar = (d) obj;
                jVar.p(1, dVar.f23373a);
                jVar.f(2, dVar.f23374b.longValue());
                return;
            case 2:
                jVar.p(1, ((g) obj).f23378a);
                jVar.f(2, r1.f23379b);
                jVar.f(3, r1.f23380c);
                return;
            case 3:
                k kVar = (k) obj;
                jVar.p(1, kVar.f23388a);
                jVar.p(2, kVar.f23389b);
                return;
            case 4:
                m mVar = (m) obj;
                jVar.p(1, mVar.f23393a);
                C1249k c1249k = C1249k.f17698b;
                jVar.g(2, c2.i.y(mVar.f23394b));
                return;
            case 5:
                p pVar = (p) obj;
                jVar.p(1, pVar.f23403a);
                jVar.f(2, Q5.e.R(pVar.f23404b));
                jVar.p(3, pVar.f23405c);
                jVar.p(4, pVar.f23406d);
                C1249k c1249k2 = pVar.f23407e;
                C1249k c1249k3 = C1249k.f17698b;
                jVar.g(5, c2.i.y(c1249k2));
                jVar.g(6, c2.i.y(pVar.f23408f));
                jVar.f(7, pVar.g);
                jVar.f(8, pVar.f23409h);
                jVar.f(9, pVar.f23410i);
                jVar.f(10, pVar.k);
                int i12 = pVar.f23411l;
                h3.o.t(i12, "backoffPolicy");
                int b2 = P.c.b(i12);
                if (b2 == 0) {
                    i7 = 0;
                } else {
                    if (b2 != 1) {
                        throw new Db.d(1);
                    }
                    i7 = 1;
                }
                jVar.f(11, i7);
                jVar.f(12, pVar.f23412m);
                jVar.f(13, pVar.f23413n);
                jVar.f(14, pVar.f23414o);
                jVar.f(15, pVar.f23415p);
                jVar.f(16, pVar.f23416q ? 1L : 0L);
                int i13 = pVar.f23417r;
                h3.o.t(i13, "policy");
                int b10 = P.c.b(i13);
                if (b10 == 0) {
                    i10 = 0;
                } else {
                    if (b10 != 1) {
                        throw new Db.d(1);
                    }
                    i10 = 1;
                }
                jVar.f(17, i10);
                jVar.f(18, pVar.f23418s);
                jVar.f(19, pVar.f23419t);
                jVar.f(20, pVar.f23420u);
                jVar.f(21, pVar.f23421v);
                jVar.f(22, pVar.f23422w);
                String str = pVar.f23423x;
                if (str == null) {
                    jVar.a(23);
                } else {
                    jVar.p(23, str);
                }
                C1243e c1243e = pVar.j;
                int i14 = c1243e.f17682a;
                h3.o.t(i14, "networkType");
                int b11 = P.c.b(i14);
                if (b11 == 0) {
                    i11 = 0;
                } else if (b11 == 1) {
                    i11 = 1;
                } else if (b11 == 2) {
                    i11 = 2;
                } else if (b11 == 3) {
                    i11 = 3;
                } else if (b11 == 4) {
                    i11 = 4;
                } else if (Build.VERSION.SDK_INT < 30 || i14 != 6) {
                    throw new IllegalArgumentException("Could not convert " + h3.o.x(i14) + " to int");
                }
                jVar.f(24, i11);
                C1921e requestCompat = c1243e.f17683b;
                kotlin.jvm.internal.l.e(requestCompat, "requestCompat");
                int i15 = Build.VERSION.SDK_INT;
                if (i15 < 28) {
                    byteArray = new byte[0];
                } else {
                    NetworkRequest networkRequest = requestCompat.f23664a;
                    if (networkRequest == null) {
                        byteArray = new byte[0];
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            try {
                                if (i15 >= 31) {
                                    r02 = networkRequest.getTransportTypes();
                                    kotlin.jvm.internal.l.d(r02, "request.transportTypes");
                                } else {
                                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                                    ArrayList arrayList = new ArrayList();
                                    for (int i16 = 0; i16 < 10; i16++) {
                                        int i17 = iArr[i16];
                                        hasTransport = networkRequest.hasTransport(i17);
                                        if (hasTransport) {
                                            arrayList.add(Integer.valueOf(i17));
                                        }
                                    }
                                    r02 = Eb.o.r0(arrayList);
                                }
                                if (Build.VERSION.SDK_INT >= 31) {
                                    r03 = networkRequest.getCapabilities();
                                    kotlin.jvm.internal.l.d(r03, "request.capabilities");
                                } else {
                                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                                    ArrayList arrayList2 = new ArrayList();
                                    int i18 = 0;
                                    for (int i19 = 30; i18 < i19; i19 = 30) {
                                        int i20 = iArr2[i18];
                                        hasCapability = networkRequest.hasCapability(i20);
                                        if (hasCapability) {
                                            arrayList2.add(Integer.valueOf(i20));
                                        }
                                        i18++;
                                    }
                                    r03 = Eb.o.r0(arrayList2);
                                }
                                objectOutputStream.writeInt(r02.length);
                                for (int i21 : r02) {
                                    objectOutputStream.writeInt(i21);
                                }
                                objectOutputStream.writeInt(r03.length);
                                for (int i22 : r03) {
                                    objectOutputStream.writeInt(i22);
                                }
                                tc.b.o(objectOutputStream, null);
                                tc.b.o(byteArrayOutputStream, null);
                                byteArray = byteArrayOutputStream.toByteArray();
                                kotlin.jvm.internal.l.d(byteArray, "outputStream.toByteArray()");
                            } finally {
                            }
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                }
                jVar.g(25, byteArray);
                jVar.f(26, c1243e.f17684c ? 1L : 0L);
                jVar.f(27, c1243e.f17685d ? 1L : 0L);
                jVar.f(28, c1243e.f17686e ? 1L : 0L);
                jVar.f(29, c1243e.f17687f ? 1L : 0L);
                jVar.f(30, c1243e.g);
                jVar.f(31, c1243e.f17688h);
                Set<C1242d> triggers = c1243e.f17689i;
                kotlin.jvm.internal.l.e(triggers, "triggers");
                if (triggers.isEmpty()) {
                    byteArray2 = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                        try {
                            objectOutputStream2.writeInt(triggers.size());
                            for (C1242d c1242d : triggers) {
                                objectOutputStream2.writeUTF(c1242d.f17680a.toString());
                                objectOutputStream2.writeBoolean(c1242d.f17681b);
                            }
                            tc.b.o(objectOutputStream2, null);
                            tc.b.o(byteArrayOutputStream2, null);
                            byteArray2 = byteArrayOutputStream2.toByteArray();
                            kotlin.jvm.internal.l.d(byteArray2, "outputStream.toByteArray()");
                        } finally {
                        }
                    } finally {
                    }
                }
                jVar.g(32, byteArray2);
                return;
            default:
                r rVar = (r) obj;
                jVar.p(1, rVar.f23435a);
                jVar.p(2, rVar.f23436b);
                return;
        }
    }

    public final void o(Object obj) {
        V2.j a9 = a();
        try {
            n(a9, obj);
            a9.f10026b.executeInsert();
        } finally {
            l(a9);
        }
    }
}
