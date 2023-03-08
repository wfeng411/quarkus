package w;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import io.quarkus.panache.common.Sort;
import w.models.lookups.Finance.FinanceExpenseType;
import w.models.lookups.Finance.FinanceTransactionType;

@Path("/Lookup")
public class LookupResource {

    @GET
    @Path("/FinanceExpenseType")
    public List<FinanceExpenseType> getFinanceExpenseTypes() {
        List<FinanceExpenseType> expenseTypes = FinanceExpenseType.listAll(Sort.by("order"));
        return expenseTypes;
    }

    @GET
    @Path("/FinanceTransactionType")
    public List<FinanceTransactionType> getFinanceTransactionType() {
        List<FinanceTransactionType> transactionTypes = FinanceTransactionType.listAll(Sort.by("order"));
        return transactionTypes;
    }

}