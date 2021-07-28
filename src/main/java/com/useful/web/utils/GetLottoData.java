package com.useful.web.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

import com.useful.web.domain.dto.LottoDTO;

public class GetLottoData {
	private static final String TARGET_URL = "https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo=";

	public static void main(String[] args) {

		for(int i = 1; i <= 971; i++)
		{
			JSONObject jo = new JSONObject(getLottoResultByDrwNo(i));
			LottoDTO dto = new LottoDTO();
			dto.setLt_drw_no(jo.getInt("drwNo"));
			dto.setLt_drwt_no_1(jo.getInt("drwtNo1"));
			dto.setLt_drwt_no_2(jo.getInt("drwtNo2"));
			dto.setLt_drwt_no_3(jo.getInt("drwtNo3"));
			dto.setLt_drwt_no_4(jo.getInt("drwtNo4"));
			dto.setLt_drwt_no_5(jo.getInt("drwtNo5"));
			dto.setLt_drwt_no_6(jo.getInt("drwtNo6"));
			dto.setLt_tot_sell_amnt(jo.getLong("totSellamnt"));
			dto.setLt_first_win_amnt(jo.getLong("firstWinamnt"));
			dto.setLt_drw_date(jo.getString("drwNoDate"));
			
			//System.out.println(jo);
		}

	}

	public static String getLottoResultByDrwNo(int drwNo) {
		return httpConnection(TARGET_URL + drwNo);
	}

	public static String httpConnection(String targetUrl) {
		URL url = null;
		HttpURLConnection conn = null;
		String jsonData = "";
		BufferedReader br = null;
		StringBuffer sb = null;
		String returnText = "";

		try {
			url = new URL(targetUrl);

			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestProperty("Accept", "application/json");
			conn.setRequestMethod("GET");
			conn.connect();

			br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));

			sb = new StringBuffer();

			while ((jsonData = br.readLine()) != null) {
				sb.append(jsonData);
			}

			returnText = sb.toString();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return returnText;
	}

}
