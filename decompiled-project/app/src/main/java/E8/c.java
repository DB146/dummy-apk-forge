package E8;

import Db.q;
import android.util.Log;
import kotlin.jvm.internal.v;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public v f3757a;

    /* renamed from: b, reason: collision with root package name */
    public v f3758b;

    /* renamed from: c, reason: collision with root package name */
    public int f3759c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f3761e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Hb.d dVar) {
        super(2, dVar);
        this.f3761e = eVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        c cVar = new c(this.f3761e, dVar);
        cVar.f3760d = obj;
        return cVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((JSONObject) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01b4 A[RETURN] */
    /* JADX WARN: Type inference failed for: r11v2, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.internal.v, java.lang.Object] */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        v vVar;
        v vVar2;
        v vVar3;
        v vVar4;
        v vVar5;
        q qVar;
        Object c10;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f3759c;
        q qVar2 = q.f3365a;
        e eVar = this.f3761e;
        Q1.g gVar = n.f3799f;
        switch (i7) {
            case 0:
                com.bumptech.glide.c.c0(obj);
                JSONObject jSONObject = (JSONObject) this.f3760d;
                Log.d("SessionConfigFetcher", "Fetched settings: " + jSONObject);
                ?? obj2 = new Object();
                ?? obj3 = new Object();
                ?? obj4 = new Object();
                if (jSONObject.has("app_quality")) {
                    Object obj5 = jSONObject.get("app_quality");
                    kotlin.jvm.internal.l.c(obj5, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject2 = (JSONObject) obj5;
                    try {
                        bool = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                    } catch (JSONException e2) {
                        e = e2;
                        bool = null;
                    }
                    try {
                        if (jSONObject2.has("sampling_rate")) {
                            obj2.f19134a = (Double) jSONObject2.get("sampling_rate");
                        }
                        if (jSONObject2.has("session_timeout_seconds")) {
                            obj3.f19134a = (Integer) jSONObject2.get("session_timeout_seconds");
                        }
                        if (jSONObject2.has("cache_duration")) {
                            obj4.f19134a = (Integer) jSONObject2.get("cache_duration");
                        }
                    } catch (JSONException e10) {
                        e = e10;
                        Log.e("SessionConfigFetcher", "Error parsing the configs remotely fetched: ", e);
                        if (bool == null) {
                        }
                    }
                } else {
                    bool = null;
                }
                if (bool == null) {
                    n e11 = eVar.e();
                    this.f3760d = obj2;
                    this.f3757a = obj3;
                    this.f3758b = obj4;
                    this.f3759c = 1;
                    Object c11 = e11.c(n.f3796c, bool, this);
                    if (c11 != Ib.a.f5345a) {
                        c11 = qVar2;
                    }
                    if (c11 == aVar) {
                        return aVar;
                    }
                    vVar3 = obj2;
                    vVar4 = obj3;
                    vVar2 = obj4;
                    vVar5 = vVar4;
                    vVar = vVar3;
                    if (((Integer) vVar5.f19134a) != null) {
                        n e12 = eVar.e();
                        Integer num = (Integer) vVar5.f19134a;
                        this.f3760d = vVar;
                        this.f3757a = vVar2;
                        this.f3758b = null;
                        this.f3759c = 2;
                        Object c12 = e12.c(n.f3798e, num, this);
                        if (c12 != Ib.a.f5345a) {
                            c12 = qVar2;
                        }
                        if (c12 == aVar) {
                            return aVar;
                        }
                    }
                    if (((Double) vVar.f19134a) != null) {
                        n e13 = eVar.e();
                        Double d10 = (Double) vVar.f19134a;
                        this.f3760d = vVar2;
                        this.f3757a = null;
                        this.f3758b = null;
                        this.f3759c = 3;
                        Object c13 = e13.c(n.f3797d, d10, this);
                        if (c13 != Ib.a.f5345a) {
                            c13 = qVar2;
                        }
                        if (c13 == aVar) {
                            return aVar;
                        }
                    }
                    if (((Integer) vVar2.f19134a) != null) {
                        n e14 = eVar.e();
                        Integer num2 = (Integer) vVar2.f19134a;
                        this.f3760d = null;
                        this.f3757a = null;
                        this.f3758b = null;
                        this.f3759c = 4;
                        Object c14 = e14.c(gVar, num2, this);
                        if (c14 != Ib.a.f5345a) {
                            c14 = qVar2;
                        }
                        if (c14 == aVar) {
                            return aVar;
                        }
                        qVar = qVar2;
                        if (qVar == null) {
                            n e15 = eVar.e();
                            Integer num3 = new Integer(86400);
                            this.f3760d = null;
                            this.f3757a = null;
                            this.f3758b = null;
                            this.f3759c = 5;
                            Object c15 = e15.c(gVar, num3, this);
                            if (c15 != Ib.a.f5345a) {
                                c15 = qVar2;
                            }
                            if (c15 == aVar) {
                                return aVar;
                            }
                        }
                        n e16 = eVar.e();
                        Long l10 = new Long(System.currentTimeMillis());
                        this.f3760d = null;
                        this.f3757a = null;
                        this.f3758b = null;
                        this.f3759c = 6;
                        c10 = e16.c(n.g, l10, this);
                        if (c10 != Ib.a.f5345a) {
                            c10 = qVar2;
                        }
                        return c10 != aVar ? aVar : qVar2;
                    }
                    qVar = null;
                    if (qVar == null) {
                    }
                    n e162 = eVar.e();
                    Long l102 = new Long(System.currentTimeMillis());
                    this.f3760d = null;
                    this.f3757a = null;
                    this.f3758b = null;
                    this.f3759c = 6;
                    c10 = e162.c(n.g, l102, this);
                    if (c10 != Ib.a.f5345a) {
                    }
                    if (c10 != aVar) {
                    }
                } else {
                    vVar = obj2;
                    vVar2 = obj4;
                    vVar5 = obj3;
                    if (((Integer) vVar5.f19134a) != null) {
                    }
                    if (((Double) vVar.f19134a) != null) {
                    }
                    if (((Integer) vVar2.f19134a) != null) {
                    }
                }
            case 1:
                vVar2 = this.f3758b;
                vVar4 = this.f3757a;
                vVar3 = (v) this.f3760d;
                com.bumptech.glide.c.c0(obj);
                vVar5 = vVar4;
                vVar = vVar3;
                if (((Integer) vVar5.f19134a) != null) {
                }
                if (((Double) vVar.f19134a) != null) {
                }
                if (((Integer) vVar2.f19134a) != null) {
                }
                break;
            case 2:
                vVar2 = this.f3757a;
                vVar = (v) this.f3760d;
                com.bumptech.glide.c.c0(obj);
                if (((Double) vVar.f19134a) != null) {
                }
                if (((Integer) vVar2.f19134a) != null) {
                }
                break;
            case 3:
                vVar2 = (v) this.f3760d;
                com.bumptech.glide.c.c0(obj);
                if (((Integer) vVar2.f19134a) != null) {
                }
                break;
            case 4:
                com.bumptech.glide.c.c0(obj);
                qVar = qVar2;
                if (qVar == null) {
                }
                n e1622 = eVar.e();
                Long l1022 = new Long(System.currentTimeMillis());
                this.f3760d = null;
                this.f3757a = null;
                this.f3758b = null;
                this.f3759c = 6;
                c10 = e1622.c(n.g, l1022, this);
                if (c10 != Ib.a.f5345a) {
                }
                if (c10 != aVar) {
                }
                break;
            case 5:
                com.bumptech.glide.c.c0(obj);
                n e16222 = eVar.e();
                Long l10222 = new Long(System.currentTimeMillis());
                this.f3760d = null;
                this.f3757a = null;
                this.f3758b = null;
                this.f3759c = 6;
                c10 = e16222.c(n.g, l10222, this);
                if (c10 != Ib.a.f5345a) {
                }
                if (c10 != aVar) {
                }
                break;
            case 6:
                com.bumptech.glide.c.c0(obj);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
