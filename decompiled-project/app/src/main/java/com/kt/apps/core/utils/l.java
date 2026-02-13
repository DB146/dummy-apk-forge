package com.kt.apps.core.utils;

import A9.C0098j;
import A9.C0151w1;
import Db.o;
import Eb.B;
import N6.C0423b0;
import N6.EnumC0421a0;
import N6.P;
import N6.Y;
import N6.Z;
import N6.l0;
import Q.C0523z;
import android.graphics.Color;
import android.text.style.ForegroundColorSpan;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.tv.model.TVDataSourceFrom;
import com.kt.apps.core.tv.viewmodels.BaseTVChannelViewModel;
import com.kt.apps.core.utils.blurry.BlurFactor;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import l2.AbstractC1456G;
import l2.H;
import okhttp3.OkHttpClient;
import okhttp3.internal._UtilJvmKt;
import p2.AbstractC1846a;
import t8.C2034c;
import va.C;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16174a;

    public /* synthetic */ l(int i7) {
        this.f16174a = i7;
    }

    @Override // Rb.a
    public final Object invoke() {
        List listShortLink_delegate$lambda$0;
        J1.f _currentProgramTitle_delegate$lambda$0;
        H _listTvChannelLiveData_delegate$lambda$1;
        Map tvChannelStreamingRetryCount_delegate$lambda$2;
        H _tvWithLinkStreamLiveData_delegate$lambda$4;
        H _listProgramForChannel_delegate$lambda$8;
        H _programmeForChannelLiveData_delegate$lambda$11;
        switch (this.f16174a) {
            case 0:
                listShortLink_delegate$lambda$0 = StringUtilsKt.listShortLink_delegate$lambda$0();
                return listShortLink_delegate$lambda$0;
            case 1:
                Db.j jVar = new Db.j("VTC", TVDataSourceFrom.VTC_BACKUP);
                Db.j jVar2 = new Db.j("VTV", TVDataSourceFrom.VTV_BACKUP);
                TVDataSourceFrom tVDataSourceFrom = TVDataSourceFrom.HTV_BACKUP;
                return B.H(jVar, jVar2, new Db.j("HTV", tVDataSourceFrom), new Db.j("HTVC", tVDataSourceFrom), new Db.j("Intenational", tVDataSourceFrom), new Db.j("AnNinh", tVDataSourceFrom), new Db.j("THVL", tVDataSourceFrom), new Db.j("DiaPhuong", tVDataSourceFrom), new Db.j("VOV", TVDataSourceFrom.VOV_BACKUP), new Db.j("VOH", TVDataSourceFrom.VOH_BACKUP));
            case 2:
                _currentProgramTitle_delegate$lambda$0 = BaseTVChannelViewModel._currentProgramTitle_delegate$lambda$0();
                return _currentProgramTitle_delegate$lambda$0;
            case 3:
                _listTvChannelLiveData_delegate$lambda$1 = BaseTVChannelViewModel._listTvChannelLiveData_delegate$lambda$1();
                return _listTvChannelLiveData_delegate$lambda$1;
            case 4:
                tvChannelStreamingRetryCount_delegate$lambda$2 = BaseTVChannelViewModel.tvChannelStreamingRetryCount_delegate$lambda$2();
                return tvChannelStreamingRetryCount_delegate$lambda$2;
            case 5:
                _tvWithLinkStreamLiveData_delegate$lambda$4 = BaseTVChannelViewModel._tvWithLinkStreamLiveData_delegate$lambda$4();
                return _tvWithLinkStreamLiveData_delegate$lambda$4;
            case 6:
                _listProgramForChannel_delegate$lambda$8 = BaseTVChannelViewModel._listProgramForChannel_delegate$lambda$8();
                return _listProgramForChannel_delegate$lambda$8;
            case 7:
                _programmeForChannelLiveData_delegate$lambda$11 = BaseTVChannelViewModel._programmeForChannelLiveData_delegate$lambda$11();
                return _programmeForChannelLiveData_delegate$lambda$11;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return new LinkedHashMap();
            case 9:
                return B.H(new Db.j("thvl1-hd", "vinhlong1hd"), new Db.j("thvl2-hd", "vinhlong2hd"), new Db.j("thvl3-hd", "vinhlong3hd"), new Db.j("thvl4-hd", "vinhlong4hd"), new Db.j("vtv-can-tho", "vtv6"), new Db.j("vtc2-reidius-tv", "vtc2"), new Db.j("vtc16-hd", "vtc16"), new Db.j("vtc4-yeah1-family-hd", "vtc4"), new Db.j("vtc7-todaytv-hd", "vtc7|todaytv"), new Db.j("vtc10-1", "vtc10"), new Db.j("vtc11-kids-tv", "vtc11"), new Db.j("htvc-du-lich-cuoc-song", "htvcdulichhd"), new Db.j("htvc-du-lich-cuoc-song", "htvcdulichhd"), new Db.j("an-giang-1", "angiang"), new Db.j("bac-giang-hd", "bacgiang"), new Db.j("bac-kan-1", "backan"), new Db.j("bac-ninh-1", "bacninh"), new Db.j("ben-tre-1-2", "bentre"), new Db.j("binh-dinh", "binhdinh"), new Db.j("binh-duong-1", "binhduong1"), new Db.j("binh-duong-2", "binhduong2"), new Db.j("binh-duong-4", "binhduong4"), new Db.j("binh-phuoc-1", "binhphuoc1"), new Db.j("binh-phuoc-2", "binhphuoc2"), new Db.j("binh-thuan-1", "binh-thuan"), new Db.j("ca-mau-1", "camau"), new Db.j("can-tho-1", "cantho"), new Db.j("dien-bien-20", "dienbien"), new Db.j("dong-thap-1", "dongthap"), new Db.j("gia-lai-1", "gialai"), new Db.j("ha-giang-1", "hagiang"), new Db.j("ha-nam-1", "hanam"), new Db.j("ha-noi-2-2021", "hanoi2"), new Db.j("ha-tinh-1", "hatinh"), new Db.j("hai-phong-1", "haiphong"), new Db.j("hau-giang-1", "haugiang"), new Db.j("hoa-binh-1", "hoabinh"), new Db.j("khanh-hoa-1", "khanhhoa"), new Db.j("kon-tum-1", "kontum"), new Db.j("lang-son-1", "langson"), new Db.j("long-an-1", "longan"), new Db.j("nghe-an-1", "nghean"), new Db.j("ninh-binh-11", "ninhbinh"), new Db.j("ninh-thuan-1", "ninhthuan"), new Db.j("quang-binh-1", "quangbinh"), new Db.j("quang-nam-1", "quangnam"), new Db.j("quang-ngai-1", "quangngai"), new Db.j("quang-ninh-1", "quangninh1"), new Db.j("quang-ninh-3", "quangninh3"), new Db.j("quang-tri-1", "quangtri"), new Db.j("soc-trang-1", "soctrang"), new Db.j("tay-ninh-3", "tayninh"), new Db.j("thai-binh-1", "thaibinh"), new Db.j("thai-nguyen-1", "thainguyen"), new Db.j("thanh-hoa-48", "thanhhoa"), new Db.j("thua-thien-hue-1", "hue"), new Db.j("tien-giang-1", "tiengiang"), new Db.j("tra-vinh-1", "travinh"), new Db.j("tuyen-quang-1", "tuyenquang"), new Db.j("vinh-phuc-1", "vinhphuc"), new Db.j("ba-ria-vung-tau-1", "vungtau"), new Db.j("yen-bai-1", "yenbai"), new Db.j("nhan-dan-hd", "nhandan"), new Db.j("quoc-hoi-viet-nam-hd", "quochoi"), new Db.j("vnews-hd", "ttxvnhd"), new Db.j("quoc-phong-hd", "qpvnhd"), new Db.j("an-ninh-hd", "antvhd|antv"));
            case 10:
                return new WeakHashMap();
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return new ConcurrentHashMap();
            case 12:
                return Integer.valueOf(Color.parseColor("#fb8500"));
            case 13:
                o oVar = ha.i.f17917e;
                return new ForegroundColorSpan(((Number) ha.i.f17917e.getValue()).intValue());
            case 14:
                C2034c c2034c = new C2034c(27, (byte) 0);
                Z z8 = EnumC0421a0.f7270b;
                Z z10 = (Z) c2034c.f24513b;
                if (!(z10 == null)) {
                    throw new IllegalStateException(Tb.a.w("Value strength was already set to %s", z10));
                }
                c2034c.f24513b = z8;
                P p10 = l0.f7306x;
                Y y10 = EnumC0421a0.f7269a;
                if (((EnumC0421a0) E6.b.k(z8, y10)) == y10) {
                    return new l0(c2034c, C0423b0.f7277b);
                }
                if (((EnumC0421a0) E6.b.k((Z) c2034c.f24513b, y10)) == z8) {
                    return new l0(c2034c, C0423b0.f7278c);
                }
                throw new AssertionError();
            case 15:
                return new Object();
            case 16:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 17:
                C0523z c0523z = AbstractC1846a.f23034a;
                return null;
            case 18:
                return new LinkedHashMap();
            case 19:
                o oVar2 = ua.e.f24912h1;
                return Integer.valueOf(R.drawable.default_background);
            case 20:
                return new AbstractC1456G();
            case 21:
                return new AbstractC1456G();
            case 22:
                return new ArrayList();
            case 23:
                C0151w1 c0151w1 = new C0151w1();
                c0151w1.g = false;
                return new C0098j(c0151w1);
            case 24:
                int i7 = C.f25269v2;
                return new ArrayList();
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                int i10 = C.f25269v2;
                return new LinkedHashMap();
            case 26:
                int i11 = C.f25269v2;
                return new Object();
            case 27:
                return new AtomicBoolean();
            case 28:
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit unit = TimeUnit.MILLISECONDS;
                kotlin.jvm.internal.l.e(unit, "unit");
                builder.f22411x = _UtilJvmKt.b(10000L, unit);
                builder.b(30000L, unit);
                return new OkHttpClient(builder);
            default:
                C0151w1 c0151w12 = new C0151w1();
                c0151w12.g = false;
                return new C0098j(c0151w12);
        }
    }
}
